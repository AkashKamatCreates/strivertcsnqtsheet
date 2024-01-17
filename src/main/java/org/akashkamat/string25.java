package org.akashkamat;

public class string25 {
    public static void main(String args[]) {
        String str = "take u forward IS Awesome";
        int length = str.length();

        System.out.println("Resultant string: ");
        System.out.println(changeCase(str, length));
    }

    static String changeCase(String s, int n){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<n; i++){
            if(Character.isLowerCase(s.charAt(i))){
                result.append(Character.toUpperCase(s.charAt(i)));
            }else{
                result.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return result.toString();
    }

}
