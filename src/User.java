/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noahc
 */
public class User {
    //LOGIN INFORMATION
    private String email; //User's email
    private String password; //User's password
    
    //PAYMENT INFORMATION
    private String cardNumber; //User's debit/credit card number (both verified with the Luhn algorithm)
    private String securityCode; //Those 3 funny numbers on the back of the user's card
    private int points; //Integer for the number of points the user has
    
    //CONSTRUCTOR METHOD
    public User(String email, String password, String cardNumber, String securityCode) {
        this.email = email;
        this.password = password;
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.points = 0; //By default, the users start with no points
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
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
    
    public void setEmail(String input) {
        email = input;
    }
    
    public void setPassword(String input) {
        password = input;
    }
    
    public void setCardNumber(String input) {
        cardNumber = input;
    }
    
    public void setSecurityCode(String input) {
        securityCode = input;
    }
    
    public void addPoints(int points) {//Safer to split this into add and remove
        this.points += points;
    }
    
    public void lowerPoints(int cost) {
        this.points -= cost;
    }
}
