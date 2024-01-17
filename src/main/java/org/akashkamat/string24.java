package org.akashkamat;

public class string24 {
    public static void main(String args[]) {
        String str = "abcdefg google microsoft"  ;
        System.out.println(HighestRepeatedLetters(str));
    }

    static String HighestRepeatedLetters(String s){
        int len = s.length();
        int left = 0;
        StringBuilder answer = new StringBuilder();
        while(left<len){
            int right = left;
            while(right<len && s.charAt(right)!=' '){
                right++;
            }

            int[] frequency = new int[26];
            for(int i=left; i<right; i++){
                frequency[s.charAt(i)-'a']++;
            }
            for(int i=0; i<26; i++){
                if(frequency[i]>1){
                    answer.append(s.substring(left, right)).append(" ");
                    break;
                }
            }
            left = right+1;
        }
        return answer.toString().trim();
    }
}
