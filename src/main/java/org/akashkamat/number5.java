package org.akashkamat;

public class number5 {
    public static void main(String[] args) {
        int n = 100;
        int m = 153;
        ArmStrongNumber(n);
        ArmStrongNumber(m);
    }
    public static void ArmStrongNumber(int n){
        int temp = n;
        int original = n;
        int size = 0;
        while(temp>0){
            size++;
            temp/=10;
        }

        int prod = 0;

        while(n>0){
            prod+=Math.pow((n%10), size);
            n=n/10;
        }


//        System.out.println(prod);
        if(prod==original){
            System.out.println("Number "+original+" is an Armstrong number");
        }else{
            System.out.println("Number "+original+" is NOT an Armstrong number");
        }
    }
}
