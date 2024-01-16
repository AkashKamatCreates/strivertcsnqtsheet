package org.akashkamat;

public class string21 {
    public static void main(String[] args) {
        String str = "Google Docs";
        System.out.print("Largest Word is: "+ LargestWord(str));
    }

    static int LargestWord(String s){
        int count = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i+1)!=' ' && i!=s.length()-1){
                count++;
                max = Math.max(max, count);
            }
        }
        return max;
    }
}
