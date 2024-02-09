package org.akashkamat;

public class number19 {
    public static void main(String[] args) {
        int n = 5;
        int p = 3;
        System.out.println(Power(n, p));
        System.out.println(Math.pow(n, p));
    }
    static int Power(int n, int p){
        int res=1;
        for(int i=0; i<p; i++){
            res = res*n;
        }
        return res;
    }
}
