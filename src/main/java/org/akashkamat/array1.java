package org.akashkamat;

public class array1 {
    public static void main(String args[]) {

        int arr1[] =  {2,5,1,3,0};
        System.out.println("The smallest element in the array is: "+SmallestElement(arr1));

        int arr2[] =  {8,10,5,7,9};
        System.out.println("The smallest element in the array is: "+SmallestElement(arr2));
    }

    static int SmallestElement(int[] arr){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for (int i=0; i<n; i++){
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}
