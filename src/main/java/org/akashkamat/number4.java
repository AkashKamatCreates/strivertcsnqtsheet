package org.akashkamat;

import java.util.ArrayList;
import java.util.Arrays;

public class number4 {
    public static void main(String[] args) {
        int a = 10;
        SeiveofEratosthenes(a);
    }
    public static void SeiveofEratosthenes(int x){
//        ArrayList<Boolean> primecheck = new ArrayList<>();
        boolean[] primecheck = new boolean[x+1];
        Arrays.fill(primecheck, true);
        for(int i=2; i<=Math.sqrt(x); i++){
            if(primecheck[i]){
                for(int j=i*i; j<=x; j+=i){
                    primecheck[j]=false;
                }
            }
        }


        System.out.println("Prime numbers between 1 and "+x+" are: ");
        for(int i=2; i<=x; i++){
            if(primecheck[i]){
                System.out.print(i+" ");
            }
        }
    }
}
