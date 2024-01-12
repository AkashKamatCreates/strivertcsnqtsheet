package org.akashkamat;

public class string12 {
    public static void main(String[] args) {
        String st = "take you forward zebra akash fox";
        System.out.print("Non-Repeating characters: ");
        nonrepeat(st);
    }

    static void nonrepeat(String s){
        int n = s.length();
        int[] frequency = new int[26];

        for(int i=0; i<n; i++){
            if(s.charAt(i)!=' '){
                frequency[s.charAt(i)-'a']++;
            }
        }
        for(int i=0; i<26; i++){
            if(frequency[i]==1){
                System.out.print((char)(i+'a')+" ");
            }
        }
    }
}
