package org.akashkamat;

import java.util.Arrays;

import static org.akashkamat.array2.LargestElement;

public class array3 {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,3,2,1};
        int n = arr.length;
        System.out.println(SecondLargest(arr));
    }

    public static int SecondLargest(int[] nums, int n){
        Arrays.sort(nums);
        return nums[n-2];
    }
    public static int SecondLargest(int[] nums){
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;
        int SecondSmallest = Integer.MAX_VALUE;

        for(int element:nums){
            if(element>Largest ) {
                SecondLargest = Largest;
                Largest = element;
            }else if(element > SecondLargest && element<Largest){
                SecondLargest = element;
            }
        }
        return SecondLargest;
    }
}
