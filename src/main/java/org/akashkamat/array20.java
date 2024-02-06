package org.akashkamat;
import static org.akashkamat.SwapClass.SwapArrayElements;

public class array20 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
        RotateArrayByKPlaces(arr, k);
        System.out.println("After Rotating the elements to right ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void RotateArrayByKPlaces(int[] arr, int k){
        int n = arr.length;

        for(int i=0; i<k; i++){
            RotateOneElementArray(arr);
        }

    }
    private static void RotateOneElementArray(int[] arr){
        int n = arr.length;
        int last = arr[n-1];
        /**
         * Since we wish to shift all elements to the right by one element,
         * we have to traverse all elements from right to left, since
         * travelling from right to left will render the whole array into a single element.
         * */
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
}
