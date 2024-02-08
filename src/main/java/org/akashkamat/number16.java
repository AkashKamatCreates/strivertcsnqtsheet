package org.akashkamat;

public class number16 {
    public static void main(String[] args) {
        int n = 4726;
        MinMax(n);
    }
    static private void MinMax(int n) {
        int d;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        while (n != 0)
        {
            d = n % 10;
            mini = Math.min(mini,d);
            maxi = Math.max(maxi,d);
            n = n / 10;
        }

        System.out.println("minimum: "+mini);
        System.out.print("maximum: "+maxi);
    }
}
