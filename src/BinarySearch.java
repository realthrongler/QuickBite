/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author noahc
 */
import java.util.ArrayList;
public class BinarySearch { //Class for binary searching things
    public boolean search(ArrayList<Customer> list, String email) { //This one searches through the arraylist passed in to the method for the input email
        return binarySearch(list, email, 0, list.size() - 1);
    }
    
    public boolean binarySearch(ArrayList<Customer> list, String email, int left, int right) {
        //Base case of left pointer being more than right pointer (entire list checked)
        if (left > right) {
            return false;
        }
        
        int mid = left + (right - left) / 2;
        String midEmail = list.get(mid).getEmail();
        int compare = email.compareToIgnoreCase(midEmail);
        
        if (compare == 0) {
            return true;
        } else if (compare < 0) {
            return binarySearch(list, email, left, mid - 1);
        } else {
            return binarySearch(list, email, mid + 1, right);
        }
    }
    public void BinarySearch() {
        //Empty for Ivan to fill out and adjust
    }
}
