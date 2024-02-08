package org.akashkamat;

import java.util.logging.Level;

public class number14 {
    public static void main(String args[]) {
        int year = 1992;
        LeapYear(year);
    }
    public static void LeapYear(int year){
        if (((year % 4 == 0) && (year % 100 != 0)) ||(year % 400 == 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
