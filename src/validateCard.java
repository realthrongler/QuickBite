/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noahc
 */
public class validateCard { //Luhn algorithm for card number verification
    boolean validateCard(String cardNumber, String securityCode) {
        boolean cardValid;
        
        cardNumber = cardNumber.strip(); //Removing spaces
        
        String[] splitNumber = cardNumber.split(" "); //Removing spaces in between the numbers
        cardNumber = String.join("", splitNumber); //Combining it into one string
        
        for (int i = 0; i < cardNumber.length(); i++) { //Checking if all the characters of the card number are actually numbers
            if ((int)cardNumber.charAt(i) < 48 || (int)cardNumber.charAt(i) > 57) {
                cardValid = false;
            }
        }
        
        char[] cardArray = cardNumber.toCharArray();
        for (int i = 0; i < cardArray.length; i++) {
            
        }
        
        return cardValid;
    } 
}
