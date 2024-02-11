package org.akashkamat;

public class number34 {
    public static void main(String args[]) {
        int radius = 5;
        areaOfCircle(radius);
    }
    private static void areaOfCircle(int r){
        double area = Math.PI * Math.pow(r, 2);
        System.out.println(area);
    }
}
