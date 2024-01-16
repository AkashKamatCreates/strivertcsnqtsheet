package org.akashkamat;

public class string17 {
    public static void main(String[] args) {
        String str = "cbacdcbc";
        System.out.println("Original String: "+str);
        System.out.println("After removing duplicates: "+removeDuplicateLetters(str));
    }

    static String removeDuplicateLetters(String s){
        StringBuilder result = new StringBuilder();

        boolean[] flag = new boolean[26];
        for(int i=0; i<s.length(); i++){
            if(flag[s.charAt(i)-'a']==false){
                result.append(s.charAt(i));
                flag[s.charAt(i)-'a']=true;
            }
        }
        return result.toString();
    }

    /** O(n**2)
    static String removeDuplicateLetters(String s){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
//            result.append(s.charAt(i));
            if(result.indexOf(String.valueOf(s.charAt(i)))==-1){
                //String.valueOf(converts characters to strings)
                //result.indexOf(only takes Strings as input so String.valueOf(char) is used.
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    } */

}
