package org.akashkamat;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class array13 {
    public static void main(String[] args) {
        int arr[]={10,9,14,8,20,48,16,9,0};
        System.out.println(Arrays.toString(insertbeginning(arr, 69)));
//        insertending(arr, 7);
//        insertatpos(arr, 4);
    }

    /**
     * make insert ending and insert at position functions
     * just like insertbeginning function
     * given below.
     *
     */
    static int[] insertbeginning(int[] arr, int n){
        ArrayList<Integer> ib = new ArrayList<>();
        ib.add(n);
        for(int element:arr){
            ib.add(element);
        }


        int[] result = new int[ib.size()];
        for(int i=0; i<arr.length; i++){
            result[i] = ib.get(i);
        }
        return result;
    }
}
