package org.akashkamat;

public class string27 {
    public static void main(String[] args) throws java.lang.Exception {
        String text = "takeuforward";
        String pattern = "forward";

        int foundIdx = foundPattern(text, pattern);

        System.out.println("The substring starts from the index: "+foundIdx);
    }

    static int foundPattern(String a, String b){
        int n = a.length();
        int m = b.length();

        int c=0;
        int start=-1;
        for(int i=0; i<n; i++){
//            if(b.charAt(i)==a.charAt(i)){
//                start=i;
//                c++;
//                if(c==m){
//                    break;
//                }
//            }

            if (b.charAt(c) == a.charAt(i)) {
                if (c == 0) {
                    start = i;
                }
                c++;
                if (c == m) {
                    break;
                }
            } else {
                c = 0;
                start = -1;
            }
        }
        return start;
    }
}
