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
    private boolean admin = false; //Boolean for whether or not the user is an admin (false by default)
    
    //PAYMENT INFORMATION
    private String cardNumber; //User's debit/credit card number (both verified with the Luhn algorithm)
    private String securityCode; //Those 3 funny numbers on the back of the user's card
    private int points; //Integer for the number of points the user has
    
    public String getEmail() {
        return email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public boolean isAdmin() {
        return admin;
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
    
    //TODO: ADD SETTER METHODS
}
