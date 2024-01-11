package org.akashkamat;

public class string2 {
    public static void main(String[] args) {
        String str = "Take u forward is Awesome";
        int length = str.length();
        solve(str, length);
    }

    static void solve(String str, int length){
        length = str.length();
        str = str.toLowerCase();
        int v=0, c=0, s=0;
        for(int i=0; i<length; i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                v++;
            }else if(str.charAt(i)==' '){
                s++;
            }else{
                c++;
            }
        }
        System.out.println(c);
        System.out.println(v);
        System.out.println(s);
    }
}
