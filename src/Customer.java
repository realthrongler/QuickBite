/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noahc
 */
public class Customer extends User{
    
    //PAYMENT INFORMATION
    private String cardNumber; //Customer's debit/credit card number (both verified with the Luhn algorithm)
    private String securityCode; //Those 3 funny numbers on the back of the customer's card
    private int points; //Integer for the number of points the customer has
    
    public Customer(String email, String password, String cardNumber, String securityCode) {
        super(email, password);
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.points = 0; //By default, the customer start with no points
        this.isAdmin = false; //Customers are not admin
    }
    
    public String getCardNumber() {
        return cardNumber;
    }
    
    public String getSecurityCode() {
        return securityCode;
    }
    
    public int getPoints() {
        return points;
    }
    
    public void setCardNumber(String input) {
        cardNumber = input;
    }
    
    public void setSecurityCode(String input) {
        securityCode = input;
    }
    
    public void addPoints(int points) { //Safer to split this into add and remove
        this.points += points;
    }
    
    public void lowerPoints(int cost) {
        this.points -= cost;
    }
}
