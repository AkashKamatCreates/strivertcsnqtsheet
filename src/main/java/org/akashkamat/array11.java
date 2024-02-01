package org.akashkamat;

import java.util.HashSet;

public class array11 {
    public static void main(String[] args) {
        int arr[] = {1,1,2,2,2,3,3};
        int k = RemoveDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int RemoveDuplicates(int[] arr){
//        HashSet<Integer> set = new HashSet<>();
//        for(int element:arr){
//            set.add(element);
//        }

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }
}
