package org.akashkamat;

public class string16 {
    public static void main(String[] args) {
        String str = "apple";
        System.out.println("Maximum occurring character is " + maxOccurringChar(str));
    }

    static char maxOccurringChar(String s){
        s = s.toLowerCase();
        int[] freq = new int[26];
        int max = 0;
        char result='a';
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
            if(freq[s.charAt(i)-'a']> max){
                max = freq[s.charAt(i)-'a'];
                result = (char)(s.charAt(i));
                System.out.println(i);
            }
        }
        return result;
    }
}
