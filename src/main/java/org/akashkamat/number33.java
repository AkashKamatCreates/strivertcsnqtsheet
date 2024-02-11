package org.akashkamat;

import static org.akashkamat.number3.PrimeNumber;

public class number33 {
    static boolean isPrime(int n) {

        if (PrimeNumber(n) && PrimeNumber(n - 2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int n = 19;

        if (isPrime(n)) {
            System.out.println("Yes");
        } else if (isPrime(n)) {
            System.out.println("No");
        }
    }
}
