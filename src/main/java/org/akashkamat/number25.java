package org.akashkamat;

import static org.akashkamat.number24.EuclideanAlgorithm;

public class number25 {


    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println(LCM(a, b));
    }
    public static int LCM(int a, int b){
        return (a*b)/EuclideanAlgorithm(a, b);
    }
}
