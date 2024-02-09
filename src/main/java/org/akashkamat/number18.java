package org.akashkamat;

public class number18 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n));
        System.out.println(FactorialRecursive(n));
    }
    protected static int Factorial(int n){
        int prod = 1;
        while(n>0){
            prod*=n;
            n--;
        }
        return prod;
    }
    private static int FactorialRecursive(int n){
        if(n<1){
            return 1;
        }else{
            return n*FactorialRecursive(n-1);
        }
    }
}
