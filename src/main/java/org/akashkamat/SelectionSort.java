package org.akashkamat;

import static org.akashkamat.SwapClass.SwapArrayElements;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;



        for(int i=0; i<n-2; i++){
            int min = i;
            for(int j=i; j<n-1; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
                SwapArrayElements(arr, j, min);
            }
        }
    }
}
