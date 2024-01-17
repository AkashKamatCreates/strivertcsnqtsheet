package org.akashkamat;

public class string21 {
    public static void main(String[] args) {
        String str = "Google Docs anotherlongword";
        System.out.print("Largest Word is: "+ LargestWord(str));
    }

    static String LargestWord(String s){
        int i=0;
        int j=0;
        int len = s.length();
        int maxlen = 0;
        int maxstart = 0;
        StringBuilder result = new StringBuilder();

        while(j<=len){
            if(j<len && s.charAt(j)!=' '){
                j++;
            }else{
                int currentlength = j-i;
                if(currentlength>maxlen){
                    maxlen = currentlength;
                    maxstart = i;
                }
                j++;
                i=j;
            }
        }
        result = result.append(s.substring(maxstart, maxstart+maxlen));
        return result.toString();
    }





//    static String LargestWord(String s){
//        int i=0;
//        int j=0;
//        int len = s.length();
//        StringBuilder result = new StringBuilder();
//        int maxlen = 0;
//        int maxstart = 0;
//        while(j<=len){
//            if(j<len && s.charAt(j)!=' '){
//                j++;
//            }else{
//                int currentlength = j-i;
//                if(currentlength > maxlen){
//                    maxlen = currentlength;
//                    maxstart = i;
//                }
//                j++;
//                i=j;
//            }
//        }
//        result = result.append(s.substring(maxstart, maxstart+maxlen));
//        return result.toString();
//
//    }
}
