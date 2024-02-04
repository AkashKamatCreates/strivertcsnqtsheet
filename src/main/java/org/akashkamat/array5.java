package org.akashkamat;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class array5 {
    public static void main(String[] args) {
        int arr[] ={10,5,10,15,10,5, 5, 5, 5, 1, 1, 1, 1, 1, 1, 1};
        CountElementFrequency(arr);
    }
    public static void CountElementFrequency(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element:nums){
            map.put(element, map.getOrDefault(element, 0)+1); //getOrDefault will fetch value for key element, or put zero incrememted by 1
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println("Array Element "+ entry.getKey() + " has Frequency: "+ entry.getValue());
        }
    }
}
