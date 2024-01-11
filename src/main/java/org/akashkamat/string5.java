package org.akashkamat;

public class string5 {
    public static void main(String[] args) {
//        char[] str = "Take you forward ".toCharArray();
//        int count = removeSpaces(str);
//        System.out.println(String.valueOf(str).subSequence(0, count));

        String str = "take you forward    akash     kamat    strings";
        System.out.println(removespaces(str));
    }

    static String removespaces(String s){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' '){
                result.append(s.charAt(i));
            }
        }
        return result.toString();

    }

}
