package org.akashkamat;

import java.util.Arrays;

import static org.akashkamat.SwapClass.SwapArrayElements;
import static org.akashkamat.BubbleSort.BubbleSort;
public class SelectionSort {
    public static void main(String[] args) {
    }

    public static void SelectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            int min = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            SwapArrayElements(arr, min, i);
        }

        System.out.println("Selection Sort: ");
        for(int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
