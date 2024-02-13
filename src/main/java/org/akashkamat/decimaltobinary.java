package org.akashkamat;

public class decimaltobinary {
    public static void main(String[] args) {
        int n = 28;
        int[] binary = new int[32];
        decimaltobinary(binary, n);
    }
    public static void decimaltobinary(int[] binary, int n){
        int i=0;
        while(n>0){
            binary[i] = n%2;
            i++;
            n=n/2;
        }
        for(int j=i-1; j>=0;j--){
            System.out.print(binary[j]+" ");
        }
    }
}
