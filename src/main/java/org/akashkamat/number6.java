package org.akashkamat;

public class number6 {
    public static void main(String[] args) {
        PerfectNumber(6);
        PerfectNumber(15);
        PerfectNumber(28);
    }

    static void PerfectNumber(int n){
        int sum = 0;

        for(int i=1; i<n; i++){
            if(n!=0){
                if(n%i==0){
                    sum+=i;
                }
            }
        }
//        System.out.println(sum);

        if(sum==n){
            System.out.println(n+" is a Perfect Number");
        }else{
            System.out.println(n+" is NOT a Perfect Number");
        }
    }
}
