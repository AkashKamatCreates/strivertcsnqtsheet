package org.akashkamat;

public class number17 {
    public static void main(String[] args) {
        int n = 10;
        Fibonacci(n);
        FibonacciSpaceOptimized(n);
        System.out.println("Recursive Fibonacci");
        System.out.println(FibonacciRecursive(n));
    }

    private static void Fibonacci(int n){
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;

        for(int i=2; i<=n; i++){
            f[i] = f[i-1]+f[i-2];
        }
        for(int element:f){
            System.out.println(element);
        }
    }

    private static void FibonacciSpaceOptimized(int n){
        System.out.println("space optimized fibonacci");
        int i1 = 0;
        int i2=1;
        System.out.println(i1);
        System.out.println(i2);
        while(i2<n){
            System.out.println(i1+i2);
            int temp = i1;
            i1 = i2;
            i2 = temp+i2;
        }
    }

    private static int FibonacciRecursive(int n){
        if(n<=1) {
            return n;
        }

        else{
            return FibonacciRecursive(n-1)+FibonacciRecursive(n-2);
        }
    }
}
