package org.akashkamat;

import java.util.ArrayList;

import static org.akashkamat.SwapClass.SwapArrayElements;

public class array8 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = 7;
        int k = 2;
        RotateArrayByKelements(arr, k);
//        System.out.println("After Rotating the array ");



    }
    public static void RotateArrayByKelements(int[] arr, int k){
//        for(int i=0; i<arr.length-k; i++){
////            SwapArrayElements(arr, )
//            arr[i+1]=arr[i];

        ArrayList<Integer> result = new ArrayList<>();
        for(int i=k; i<arr.length;i++ ){
            result.add(arr[i]);
        }
        for(int i=0; i<k; i++){
            result.add(arr[i]);
        }


        for(Integer element:result){
            System.out.print(element+" ");
        }
    }
}
