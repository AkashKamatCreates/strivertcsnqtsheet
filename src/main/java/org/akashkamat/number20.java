package org.akashkamat;

public class number20 {
    public static void main(String args[])
    {   int n = 14;
        System.out.print("Factors of " + n + " are: ");
        Factors(n);;
    }

    static void Factors(int n) {
        for (int i=1;i<=Math.sqrt(n); i++) {
            if (n%i==0) {
                if (n/i == i)
                    System.out.print(" "+ i);

                else
                    System.out.print(i+" " + n/i + " " );
            }
        }
    }
}
