/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noahc
 */
public class Admin extends User{
    public Admin(String email, String password) {
        super(email, password);
        this.isAdmin = true; //This is an admin
    }
}
