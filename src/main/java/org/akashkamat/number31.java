package org.akashkamat;

import static org.akashkamat.number24.EuclideanAlgorithm;
import static org.akashkamat.number25.LCM;

public class number31 {
    public static void main(String args[]) {
        int num1 = 3, den1 = 4, num2 = 1, den2 = 7, num3, den3;
        int lcm = LCM(den1, den2);
        den3 = lcm;
        num3 = num1 * (den3 / den1) + num2 * (den3 / den2);
        simple(num3, den3);
        System.out.println(num1 + "/" + den1 + " + " + num2 + "/" + den2 + " = " + num3 + "/" + den3);
    }
    static void simple(int num3, int den3) {
        int gcd = EuclideanAlgorithm(num3, den3);
        num3 /= gcd;
        den3 /= gcd;
    }
}
