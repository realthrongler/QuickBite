/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author ivanlin
 */
public class Order {
    //Instance Variables
    private int orderID;
    private double cost;
    private ArrayList<Item> items;
    
    //Constructor
    public Order(int orderID, double cost, ArrayList<Item> items){
        this.orderID = orderID;
        this.cost = cost;
        this.items = items;
    }
    
    //Getter Methods
    public int getOrderID(){
        return orderID;
    }
    public double getCost(){
        return cost;
    }
    public ArrayList<Item> getItems(){
        return items;
    }
    
    //Setter Methods
    public void setOrderID(int orderID){
        this.orderID = orderID;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setItems(ArrayList<Item> items){
        this.items = items;
    }
    
    
    @Override
    public String toString(){
        String strItems = "";
        for(int i = 0; i < items.size(); i++){
            strItems += "," + items.get(i).toString("user");
        }
        return orderID + "," + cost + strItems;
    }
    
    
}
