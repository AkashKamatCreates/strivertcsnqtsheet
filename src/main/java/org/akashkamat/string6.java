package org.akashkamat;

public class string6 {
    public static void main(String[] args) {
        String str = "take12% *&u ^$#forward";
        System.out.println(keepAlphabet(str));
    }

    static String keepAlphabet(String s){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
