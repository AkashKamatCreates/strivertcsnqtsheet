package org.akashkamat;

public class string1 {
    public static void main(String[] args) {
        String str = "ABCDCBA";
        boolean ans = isPalindrome(str);
        boolean ansrec = ispalindromerecursive(0, str);

        if(ansrec == true){
            System.out.println("recursive is palindrome ");
        }
        if (ans == true) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

    }

    static boolean isPalindrome(String s){
        int left=0; int right = s.length()-1;
//        s.toLowerCase(s)
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
    

    static boolean ispalindromerecursive(int i, String s){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-1-i))return false;
        return ispalindromerecursive(i+1, s);

//        return true;
    }
}
