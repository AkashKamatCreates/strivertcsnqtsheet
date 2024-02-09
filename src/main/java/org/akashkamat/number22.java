package org.akashkamat;

import static org.akashkamat.number18.Factorial;

public class number22 {

    public static void main(String[] args) {
        int number = 145;
        int answer = StrongNumber(number);
        if (answer == number && number != 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    public static int StrongNumber(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + Factorial(digit);
            num = num / 10;
        }
        return sum;
    }
}
