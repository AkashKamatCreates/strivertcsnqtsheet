package org.akashkamat;

public class array2 {
    static int LargestElement(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<n; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }



    public static void main(String[] args) {
        int[] arr = {12, 345, 1323, 45, 123, 532};
        System.out.println(LargestElement(arr));
    }
}
