package org.akashkamat;

public class array24 {
    public static void main(String[] args) {
        int arr[] = {6, 7, 9, 5, 3, 10};
        int k = 10;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==k){
                System.out.println(i);
            }
        }
    }
}
