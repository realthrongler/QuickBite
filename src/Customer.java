/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noahc
 */
import java.util.HashMap;
import java.util.Map;
public class Customer extends User{
    //CLASS VARIABLES
    private static int orderNumber = 0;
    
    //PAYMENT INFORMATION
    private String cardNumber; //Customer's debit/credit card number (both verified with the Luhn algorithm)
    private String securityCode; //Those 3 funny numbers on the back of the customer's card
    private int points; //Integer for the number of points the customer has
    private HashMap<String, String> orders = new HashMap<>(); //Hashmap for storing pending orders the customer has made
    
    public Customer(String email, String password, String cardNumber, String securityCode) {
        super(email, password);
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
        this.points = 0; //By default, the customer start with no points
        this.isAdmin = false; //Customers are not admin
    }
    
    //GETTER METHODS
    public String getCardNumber() {
        return cardNumber;
    }
    
    public String getSecurityCode() {
        return securityCode;
    }
    
    public int getPoints() {
        return points;
    }
    
    public int getOrderNumber() {
        orderNumber += 1;
        return orderNumber - 1;
    }
    
    public String[] getPendingOrders() { //Returns a string array with the order number and order contents in each index
        String[] pendingOrders = new String[orders.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : orders.entrySet()) { //This code was adapted from a geeksforgeeks article on HashMaps
            pendingOrders[i++] = entry.getKey() + ": " + entry.getValue();
        }
        return pendingOrders;
    }
    
    //SETTER METHODS
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
    
    //When the customer makes an order, store the order contents in the pending orders hashmap and give it a key that is the shared order number
    public void makeOrder(String order) { 
        orders.put(Integer.toString(this.getOrderNumber()), order);
    }
}
