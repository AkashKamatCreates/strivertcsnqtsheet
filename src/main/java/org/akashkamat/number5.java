package org.akashkamat;

public class number5 {
    public static void main(String[] args) {
        int n = 123;
        int m = 153;

    }
    public static void ArmStrongNumber(int n){
        int temp = 0;
        int size = 0;
        while(n>0){
            size++;
            n=n/10;
        }

        int prod =0;

        for(int i=0; i<size; i++){
            prod = prod * (n%10);

        }



        if(temp==n){
            System.out.println("Number "+n+" is an Armstrong number");
        }else{
            System.out.println("Number "+n+" is NOT an Armstrong number");
        }
    }
}
