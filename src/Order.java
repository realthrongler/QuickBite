/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author Noah Cummings, Ivan Lin, Logan Sevatzian
 */
public class Order {
    //Instance Variables
    private int orderID;
    private int period;
    private int status;
    private double cost;
    private ArrayList<Item> items;
    
    //Constructor
    public Order(int orderID, int period, int status, double cost, ArrayList<Item> items){
        this.orderID = orderID;
        this.period = period;
        this.status = status;
        this.cost = cost;
        this.items = items;
    }
    
    //Getter Methods
    public int getOrderID(){
        return orderID;
    }
    public int getPeriod(){
        return period;
    }
    public int getStatusInt(){
        return status;
    }
    public String getStatusString(){
        if(status > 0){
            return "ready";
        } else if(status < 0) {
            return "not ready";
        } else {
            return "served";
        }
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
    public void setPeriod(int period){
        this.period = period;
    }
    public void setStatus(int status){
        this.status = status;
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
            strItems += "," + items.get(i).toString();
        }
        return orderID + "," + period + "," + status + "," + cost + strItems;
    }
    
    
}
