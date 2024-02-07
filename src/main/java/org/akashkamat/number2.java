package org.akashkamat;

import static org.akashkamat.number1.PalindromeNumber;

public class number2 {
    public static void main(String[] args) {
        int min = 100;
        int max = 150;
        for(int i=min; i<=max; i++) {
            if(PalindromeNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
