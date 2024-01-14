package org.akashkamat;

public class string16 {
    public static void main(String[] args) {
        String str = "takeuforward";
        System.out.println("Maximum occurring character is " + maxOccurringChar(str));
    }

    static char maxOccurringChar(String s){
        int[] frequency = new int[256];
        for(int i=0; i<s.length(); i++){
            frequency[s.charAt(i)]++;
        }
        

        return (char)(max);
    }
}
