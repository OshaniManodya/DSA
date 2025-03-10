/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapexample;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> myMap=new HashMap<>();

        myMap.put("apple",10);
        myMap.put("banana",20);
        myMap.put("orange",15);

        System.out.println("Quantity of apples"+myMap.get("apple"));

        System.out.println("Iterating over the map:");
        for(Map.Entry<String,Integer> entry : myMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        myMap.remove("banana");
        System.out.println("After removing banana:"+myMap);
    }
    
}
