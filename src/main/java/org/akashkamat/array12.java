package org.akashkamat;

import java.util.HashSet;

public class array12 {
    public static void main(String[] args) {
        int arr[]={2,3,1,9,3,1,3,9};
        for(int i=0; i< RemoveDuplicatesfromUnsortedArray(arr); i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int RemoveDuplicatesfromUnsortedArray(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int element:arr){
            set.add(element);
        }
        int k = set.size();
        int i=0;
        for(Integer element:set){
            arr[i++] = element;
        }
        return set.size();
    }
}
