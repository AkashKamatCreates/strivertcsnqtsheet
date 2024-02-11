package org.akashkamat;

import static org.akashkamat.SwapClass.SwapArrayElements;

public class InsertionSort {
    public static void main(String[] args) {

    }
    public static void InsertionSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<=n-1; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                SwapArrayElements(arr, j, j-1);
                j--;
            }
        }

        System.out.println("Insertion Sort: ");
        for(int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
