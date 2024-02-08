package org.akashkamat;

public class number10 {

    public static void main(String args[]) {
        double a = 1.5, d = 3;
        int n = 5;
        System.out.println("Sum of Given Ap Series: "+SumofAp(a, d, n));
    }
    static double SumofAp(double a, double d, int n) {
        double sum = (n / 2.0) * (2.0 * a + (n - 1) * d);
        return sum;
    }
}
