package org.akashkamat;

public class number3 {
    public static void main(String[] args) {
        int n = 7;
        boolean ans = (PrimeNumber(n));
        if (n != 1 && ans == true) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Non Prime Number");
        }
    }
    public static boolean PrimeNumber(int n){
        for(int i=2; i< Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
            return true;
        }
        return false;
    }
}
