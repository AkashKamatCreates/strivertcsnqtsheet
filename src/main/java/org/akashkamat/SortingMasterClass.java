package org.akashkamat;

import static org.akashkamat.SelectionSort.SelectionSort;
import static org.akashkamat.BubbleSort.BubbleSort;
import static org.akashkamat.InsertionSort.InsertionSort;
import static org.akashkamat.QuickSort.QuickSort;
import static org.akashkamat.MergeSort.MergeSort;

public class SortingMasterClass {
    public static void main(String[] args) {
        int[] a = {13, 46, 24, 52, 20, 9};
        System.out.println("Original Array: ");
        for(int element:a){
            System.out.print(element+" ");
        }
        System.out.println();

        int[] a1 = {13, 46, 24, 52, 20, 9};
        SelectionSort(a1);

        int[] a2 = {13, 46, 24, 52, 20, 9};
        BubbleSort(a2);

        int[] a3 = {13, 46, 24, 52, 20, 9};
        InsertionSort(a3);
    }
}
