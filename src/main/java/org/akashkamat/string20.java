package org.akashkamat;

public class string20 {
    public static void main(String args[]) {
        String str = "abcdxyz";
        int length = str.length();
        System.out.println("Original string: ");
        System.out.println(str);
        System.out.println("New string: ");
        System.out.println(lexographicalNext(str, length));
    }

    static String lexographicalNext(String s, int n){
        StringBuilder result = new StringBuilder();

        for(int i=0; i<n; i++){
            if(s.charAt(i)!='z'){
                result.append((char)(s.charAt(i)+1));
            }else{
                result.append('a');
            }
        }
        return result.toString();
    }

}
