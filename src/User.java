/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noah Cummings, Ivan Lin, Logan Sevatzian
 */
public class User {
    //LOGIN INFORMATION
    protected String email; //User's email
    protected String password; //User's password
    protected boolean isAdmin;
    
    //CONSTRUCTOR METHOD
    protected User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    protected boolean isAdmin() {
        return isAdmin;
    }
    
    protected String getEmail() {
        return email;
    }
    
    protected String getPassword() {
        return password;
    }
    
    protected void setEmail(String input) {
        email = input;
    }
    
    protected void setPassword(String input) {
        password = input;
    }
}
