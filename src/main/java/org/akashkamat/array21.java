package org.akashkamat;

public class array21 {
    public static void main(String[] args) {
        int n = 5;
        int nums[] = {2, 3, -1, 8, 4};
        int equilibriumidx = EquibriumIndex(nums);
        System.out.println(equilibriumidx);
    }

    public static int EquibriumIndex(int[] arr){
        int total = 0;
        for(int i=0; i<arr.length; i++){
            total+=arr[i];
        }
        int leftsum=0;
        for(int i=0; i<arr.length; i++){
            total-=arr[i];
            if(total == leftsum){
                return i;
            }
            leftsum+=arr[i];
        }

        return -1;
    }

}
