package org.akashkamat;

public class string4 {
    public static void main(String[] args) {
        String str = "take u forward";
        System.out.println("String after removing the vowels: " + RemoveVowels(str));
    }
    static String RemoveVowels(String s){
        int len= s.length();
        StringBuilder result = new StringBuilder();

        for(int i=0; i<len; i++){
            if(!isVowel(s.charAt(i))){
                result.append(s.charAt(i));
//                s=s.substring(0, i)+s.substring(i + 1);
            }
        }
        return result.toString();
    }
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
