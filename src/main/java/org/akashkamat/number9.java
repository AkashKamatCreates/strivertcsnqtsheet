package org.akashkamat;

public class number9 {
    public static void main(String[] args) {
        System.out.println(SumofFirstKNumbers(5));
        System.out.println(SumofFirstKNumbers(100));
    }
    static int SumofFirstKNumbers(int k){
        int sum = (k*(k+1))/2;
        return sum;
    }
}
