package org.akashkamat;

import static org.akashkamat.SwapClass.SwapArrayElements;

public class BubbleSort {
    public static void main(String[] args) {

    }
    public static void BubbleSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                SwapArrayElements(arr, i, i+1);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    SwapArrayElements(arr, j, j+1);
                }
            }
        }

        System.out.println("Bubble Sort: ");
        for(int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
