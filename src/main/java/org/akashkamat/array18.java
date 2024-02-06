package org.akashkamat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class array18 {
    public static void main(String[] args) {
        int arr[] = {20,15,26,2,98,6};
        int temp[] = arr.clone();
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<temp.length; i++){
            map.put(temp[i], i+1);
        }

        for(int i=0; i<temp.length; i++){
            System.out.print(map.get(arr[i])+" ");
        }

    }
}
