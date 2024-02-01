package org.akashkamat;

//import static com.sun.tools.javac.jvm.ByteCodes.swap;
import static org.akashkamat.SwapClass.SwapArrayElements;

public class array4 {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1};
        ReverseArray(arr);
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
    public static void ReverseArray(int[] nums){
        int start=0;
        int end = nums.length-1;
        while(start<end){
            SwapArrayElements(nums, start, end);
            start++;
            end--;
        }
    }


}
