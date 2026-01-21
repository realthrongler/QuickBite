/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noah Cummings, Ivan Lin, Logan Sevatzian
 */
public class Item {
    //Instance Variables
    private String name;
    private int quantity;
    private double cost;
    
    //Constructor
    public Item(String name, int quantity, double cost){
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
    }
    
    //Getter Methods
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getCost(){
        return cost;
    }
    
    //Setter Methods
    public void setName(String name){
        this.name = name;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    
    @Override
    public String toString(){
        return name + "," + quantity + "," + cost;
    }
    public String toString(String str){
        if(str.equals("admin")){
            return name + "," + cost;
        } else if (str.equals("user")){
            return name + "," + quantity;
        } else {
            return "";
        }
    }
}
