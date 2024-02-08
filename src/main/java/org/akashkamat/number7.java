package org.akashkamat;

public class number7 {
    public static void main(String[] args) {
        OddEven(2);
        OddEven(3);
        OddEven(4);
        OddEven(5);
    }
    static void OddEven(int n){
        if(n%2==0){
            System.out.println(n+" is EVEN");
        }
        else{
            System.out.println(n+" is ODD");
        }
    }
}
