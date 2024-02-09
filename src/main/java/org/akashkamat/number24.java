package org.akashkamat;

public class number24 {
    public static void main(String[] args) {
        int n = 100;
        int m = 200;
        System.out.println(GCD(n, m));
        System.out.println(EuclideanAlgorithm(n, m));
    }

    public static int GCD(int a, int b){
        int d = Math.min(a, b);
        int res = 0;
        for(int i=1; i<=d; i++){
            if(a%i==0 && b%i==0){
                res = Math.max(res, i);
            }
        }
        return res;
    }

    public static int EuclideanAlgorithm(int a, int b){
        if(b==0){
            return a;
        }else{
            return EuclideanAlgorithm(b, a%b);
        }
    }
}
