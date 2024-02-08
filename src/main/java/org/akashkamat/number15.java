package org.akashkamat;

public class number15 {
    public static void main(String[] args) {
        int n = 472;
        System.out.println(ReverseNumber(n));
    }
    public static int ReverseNumber(int n){
        int reverse = 0;
        while(n>0){
            reverse = (reverse*10) + (n%10);
            n=n/10;
        }
        return reverse;
    }
}
