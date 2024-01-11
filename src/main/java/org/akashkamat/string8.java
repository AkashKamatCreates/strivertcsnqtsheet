package org.akashkamat;

public class string8 {
    public static void main(String[] args) {
        String input1 = "a+((b-c)+d)";
        String input2 = "(((a-b))+c)";

        System.out.println("Original String: "+input1);
        System.out.println("After removing brackets: "+removebrackets(input1));
        System.out.println("Original String: "+input2);
        System.out.println("After removing brackets: "+removebrackets(input2));
    }

    static String removebrackets(String s){
        StringBuilder result = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='(' && s.charAt(i)!=')'){
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}
