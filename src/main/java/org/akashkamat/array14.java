package org.akashkamat;

import java.util.HashMap;
import java.util.Map;

public class array14 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,2};
        int result = FindRepeatingElements(arr);
        for(int i=0; i<result; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static int FindRepeatingElements(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int element:arr){
            map.put(element, map.getOrDefault(element, 0)+1);
        }
        int count = 0;
        int i=0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                arr[i++]=entry.getKey();
                count++;
            }
        }

        return count;

    }
}
