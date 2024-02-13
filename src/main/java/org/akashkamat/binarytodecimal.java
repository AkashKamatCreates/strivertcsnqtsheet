package org.akashkamat;

public class binarytodecimal {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(binarytodecimal(n));
//        binarytodecimal(n);
    }
    public static int binarytodecimal(int n){
        int last = 0;
        double result = 0;
        double i=0;
        while(n>0){
            last = n%10;
            result = result + last*Math.pow(2, i++);
            n=n/10;
        }
        return (int)result;

    }
}
