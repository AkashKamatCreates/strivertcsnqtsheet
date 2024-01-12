package org.akashkamat;

public class string10 {
    public static void main(String args[]) {
        String str = "take u forward has good question list and cool guides";
        int size = str.length();

        System.out.println("String after capitalizing first and last letter of each word of the string: ");
        System.out.println(Capitalize(str, size));
    }

    static String Capitalize(String s, int n){
        StringBuilder result = new StringBuilder(s);
        for(int i=0; i<n; i++){
            if(i==0 || i==(n-1) && (int)s.charAt(i)>96){
                result.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
            else if(s.charAt(i)==' '){
                result.setCharAt(i-1, Character.toUpperCase(s.charAt(i-1)));
                result.setCharAt(i+1, Character.toUpperCase(s.charAt(i+1)));
            }
        }
        return result.toString();
    }
}
