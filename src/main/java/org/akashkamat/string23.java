package org.akashkamat;

public class string23 {
    public static void main(String[] args) {
        String s = "this is a 6 word sentence";
        System.out.println(countWords(s));
    }

    static int countWords(String s){
        int len = s.length();
        int count = 0;
        int max = 0;
        for(int i=0; i<len; i++){
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
}
