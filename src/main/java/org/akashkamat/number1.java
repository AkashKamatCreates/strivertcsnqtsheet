package org.akashkamat;

public class number1 {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(PalindromeNumber(x));
    }

    public static boolean PalindromeNumber(int x){
        int rev = reverse(x);
        if(rev==x){
            return true;
        }else{
            return false;
        }

    }
    public static int reverse(int x){
        int temp = 0;
        while(x>0){
            temp = (temp*10) + (x%10);
            x=x/10;
        }
        return temp;
    }
}
