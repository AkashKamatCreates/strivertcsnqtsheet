package org.akashkamat;

import java.util.HashMap;

public class array25 {
    public static void main(String[] args) {

        int arr1[]={1,3,4,5,2};
        int arr2[]={2,4,3,1,7,5,15};

        int m = arr1.length;
        int n = arr2.length;

        boolean ans = isSubset(arr1, m, arr2, n);

        if (ans == true)
            System.out.print("arr1[] is a subset of arr2[]");
        else System.out.print("arr1[] is not a subset of arr2[]");

    }

    public static boolean isSubset(int[] arr1, int m, int[] arr2, int n){
        HashMap<Integer, Boolean> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr2[i], true);
        }
        for(int i=0; i<m; i++){
            if(!map.containsKey(arr1[i])){
                return false;
            }
        }
        return true;
    }
}
