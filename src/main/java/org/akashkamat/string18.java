package org.akashkamat;


import java.util.*;
public class string18 {
    public static void main(String[] args) {
        String s = "sinstriiintng";

//        HashMap<Character, Integer> map = new HashMap<>();
//        for(int i=0; i<s.length(); i++){
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//        }
//        for()

        int[] frequency = new int[26];
        for(int i=0; i<s.length(); i++){
            frequency[s.charAt(i)-97]++;
        }
        for(int i=0; i<26; i++){
            if(frequency[i]>1){
                char reschar = (char)(i+97);
                System.out.println(reschar + " - "+ frequency[i]);
            }
        }
    }
}
