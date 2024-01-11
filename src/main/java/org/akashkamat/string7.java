package org.akashkamat;

public class string7 {
    public static void main(String[] args) {
        String str = "striver sheet String question 7";
        System.out.println(absolutereverse(str));
    }

    static String absolutereverse(String s){
        StringBuilder result = new StringBuilder(s);
        int left = 0, right = s.length()-1;
        while(left<right){
            charswap(result, left, right);
            left++;
            right--;
        }
        return result.toString();
    }

    static void charswap(StringBuilder s, int l,  int r){
        char temp = s.charAt(l);
        s.setCharAt(l, s.charAt(r));
        s.setCharAt(r, temp);
    }
}
