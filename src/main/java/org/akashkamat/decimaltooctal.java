package org.akashkamat;

public class decimaltooctal {
    public static void main(String[] args) {
        int n = 17;
        int[] binary = new int[32];
        decimaltooctal(binary, n);
    }
    public static void decimaltooctal(int[] binary, int n){
        int i=0;
        while(n>0){
            binary[i] = n%8;
            i++;
            n=n/8;
        }
        for(int j=i-1; j>=0;j--){
            System.out.print(binary[j]);
        }
    }
}
