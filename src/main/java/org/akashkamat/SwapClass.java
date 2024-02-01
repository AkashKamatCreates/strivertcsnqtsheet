package org.akashkamat;

public class SwapClass {
    public static void main(String[] args) {
    }

    public static void SwapArrayElements(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
