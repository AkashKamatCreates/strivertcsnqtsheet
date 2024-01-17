package org.akashkamat;

import java.util.*;

public class string22 {
    public static void main(String args[]) {
        String str = "zxcbg";

        System.out.println("String after sorting:");
        System.out.println(sortCharacters(str));
    }

    static String sortCharacters(String s){
        char[] res = s.toCharArray();
        Arrays.sort(res);
        String result = new String(res);
        return result;
    }
}
