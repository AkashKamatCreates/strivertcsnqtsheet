package org.akashkamat;

import java.util.ArrayList;

public class binarytooctal {
    public static void main(String[] args) {
        int n = 1100110;
        binaryToOctal(n);
    }

    public static void binaryToOctal(int n) {
        int last = 0;
        int i = 0;

        int[] key = {1, 2, 4};

        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;

        // Reverse the binary number
        int reversedBinary = 0;
        int temp = n;
        while (temp != 0) {
            last = temp % 10;
            reversedBinary = reversedBinary * 10 + last;
            temp /= 10;
        }

        // Process binary digits in groups of 3
        while (reversedBinary != 0) {
            i = 0;
            result = 0;
            while (i < 3) {
                last = reversedBinary % 10;
                result += last * key[i];
                i++;
                reversedBinary /= 10;
            }
            list.add(result);
        }

        // Print octal digits
        System.out.print("Octal equivalent: ");
        for (int j = list.size() - 1; j >= 0; j--) {
            System.out.print(list.get(j));
        }
    }
}

