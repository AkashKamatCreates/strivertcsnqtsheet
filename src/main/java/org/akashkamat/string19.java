package org.akashkamat;

public class string19 {
    public static void main(String args[]) {
        String str1 = "abcdef";
        String str2 = "cefz";

        System.out.println("Final string 1:");
        System.out.println(commonremoved(str1, str2));
    }
    static String commonremoved(String s1, String s2){
//        StringBuilder a1 = new StringBuilder(s1);
//        StringBuilder a2 = new StringBuilder(s2);
        StringBuilder result = new StringBuilder();

        for(int i=0; i<s1.length(); i++){
            if(s2.indexOf(s1.charAt(i))==-1){
                result.append(s1.charAt(i));
            }
        }
        return result.toString();

    }
}
