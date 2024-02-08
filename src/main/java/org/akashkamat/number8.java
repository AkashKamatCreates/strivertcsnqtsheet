package org.akashkamat;

public class number8 {
    public static void main(String[] args) {
        PositiveNegativeNumber(0);
        PositiveNegativeNumber(-345);
        PositiveNegativeNumber(3456);
    }
    static void PositiveNegativeNumber(int n){
        if(n>0){
            System.out.println(n+" is Positive");
        }else if(n<0){
            System.out.println(n+" is Negative");
        }else{
            System.out.println(n+" is Neither positive nor negative");
        }
    }
}
