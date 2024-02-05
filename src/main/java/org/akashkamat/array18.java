package org.akashkamat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class array18 {
    public static void main(String[] args) {
        int arr[] = {20,15,26,2,98,6};
        int temp[] = arr;
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<temp.length; i++){
            map.put(temp[i], i);
        }

        for(int i=0; i<temp.length; i++){
            if(map.containsKey(arr[i])){
                for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                    System.out.println(entry.getKey());
                }
            }
        }

    }
}
