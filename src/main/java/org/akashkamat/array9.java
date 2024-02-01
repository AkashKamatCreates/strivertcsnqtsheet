package org.akashkamat;

public class array9 {
    public static void main(String[] args) {
        int arr[] = {4,7,1,2,5,6};
        int sum = 0;
        for(int element:arr){
            sum+=element;
        }
        int result = sum/arr.length;
        System.out.println(result);
    }
}
