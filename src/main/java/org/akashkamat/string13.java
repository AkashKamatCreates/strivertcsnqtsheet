package org.akashkamat;

public class string13 {
    public static void main(String args[]) {
        String Str1 = "INTEGER";
        String Str2 = "TEGERNI";
        System.out.println(checkAnagrams(Str1, Str2));
    }
    /** checkAnagrams() will work only for all UPPERCASE input words */
    static boolean checkAnagrams(String a, String b){
        int[] afrequency = new int[26];
        int[] bfrequency = new int[26];

        int alen = a.length();
        int blen = b.length();

        if(alen!=blen) return false;
        for(int i=0; i<alen; i++){
            afrequency[a.charAt(i)-'A']++;
            bfrequency[b.charAt(i)-'A']++;
        }
        for(int i=0; i<26; i++){
            if(afrequency[i]!=bfrequency[i]){
                return false;
            }
        }
        return true;
    }
}
