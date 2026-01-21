/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Noah Cummings, Ivan Lin, Logan Sevatzian
 */
import java.util.ArrayList;
public class InsertionSort {
    public void InsertionSort(ArrayList<Customer> list) {
        for (int i = 1; i < list.size(); i++) {
            
            Customer index = list.get(i);
            String email = index.getEmail();
            
            int j = i - 1;
            
            while (j >= 0 && list.get(j).getEmail().compareToIgnoreCase(email) > 0) {
                list.set(j + 1, list.get(j));
                j--;
            }
            
            list.set(j + 1, index);
        }
    }
}
