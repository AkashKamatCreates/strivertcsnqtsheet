package org.akashkamat;

public class number23 {
    public static boolean AutomorphicNumber(int n) {
        int sq = n * n;
        while (n > 0) {
            if (n % 10 != sq % 10)
                return false;
            n /= 10;
            sq /= 10;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 25;
        if(AutomorphicNumber(n)==true)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic Number");
    }
}
