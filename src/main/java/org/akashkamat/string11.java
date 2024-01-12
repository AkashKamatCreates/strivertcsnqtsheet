package org.akashkamat;

public class string11 {
    public static void main(String args[]){
        String str = "akashkamatstringszebra";
        String str1 = "a quick brown fox jumps over the lazy dog";
        Printfrequency(str);
        System.out.println();
        Printfrequency(str1);
    }
    static void Printfrequency(String s){
        int[] frequency = new int[26];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                frequency[s.charAt(i)-'a']++;
            }
        }
        for(int i=0; i<26; i++){
            if(frequency[i]!=0){
                System.out.print((char)(i+'a'));
                System.out.print(frequency[i]+" ");
            }
        }
    }
}
