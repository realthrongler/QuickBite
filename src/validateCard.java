/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noahc
 */
public class ValidateCard{ //Luhn algorithm for card number verification
    //Methods
    public boolean ValidateCard(String cardNumber, String securityCode) {
        boolean cardValid = true;
        
        cardNumber = cardNumber.strip(); //Removing spaces on the ends of the input
        
        if (securityCode.length() > 3 || securityCode.length() < 3) { //Checking security code (This is as much as we can do because we don't have access to a bank database to actually check
            cardValid = false;
        }
        
        String[] splitNumber = cardNumber.split(" "); //Removing spaces in between the numbers
        cardNumber = String.join("", splitNumber); //Combining it into one string
        
        if (cardNumber.length() > 19) { //Card number lengths vary, but never go higher than 19 digits
            cardValid = false;
        }
        
        for (int i = 0; i < cardNumber.length(); i++) { //Checking if all the characters of the card number are actually numbers
            if ((int)cardNumber.charAt(i) < 48 || (int)cardNumber.charAt(i) > 57) {
                cardValid = false;
            }
        }
        if (cardValid) {
            char[] cardArray = cardNumber.toCharArray();
            //First step of Luhn algorithm is to double every second digit starting from the second last digit
            //If the digit doubled is 10 or greater, add the 2 digits together
            //for example, 13 --> 4 because 1 + 3 == 4.
            for (int i = cardArray.length - 2; i >= 0; i -= 2) { 
                int digit = (Character.getNumericValue(cardArray[i]) * 2); //Doubling the digit
                switch (digit) { //Adding digits together if the product is 10 or greater
                    case 10:
                        cardArray[i] = '1';
                        break;
                    case 12:
                        cardArray[i] = '3';
                        break;
                    case 14:
                        cardArray[i] = '5';
                        break;
                    case 16:
                        cardArray[i] = '7';
                        break;
                    case 18:
                        cardArray[i] = '9';
                        break;
                    default:
                        cardArray[i] = Character.forDigit(digit, 10); //If the digit doubled is not 10 or greater, set the current digit to the product
                        break;
                }
            }
            
            int normalSum = 0;
            for (int g = 0; g < cardArray.length; g += 2) { //Sum of all non-doubled digits
                normalSum += Character.getNumericValue(cardArray[g]);
            }
            
            int doubledSum = 0;
            for (int j = 1; j < cardArray.length; j += 2) { //Sum of all doubled digits
                doubledSum += Character.getNumericValue(cardArray[j]);
            }
            
            int checkSum = normalSum + doubledSum;
            
            if ((checkSum % 10) != 0) { //If the sum of the doubled digits plus the sum of the non-doubled digits ends with a zero, it is valid.
                cardValid = false;
            }
        }
        return cardValid;
    } 
}
