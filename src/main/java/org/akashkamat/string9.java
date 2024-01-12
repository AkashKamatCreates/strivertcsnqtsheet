package org.akashkamat;

public class string9 {
    public static void main(String[] args) {

        String str = "1bc268";
        System.out.print("Sum: ");
        System.out.println(findSum(str));
    }

    static int findSum(String s){
        String nums = "0";
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
                nums+=s.charAt(i);
            }
            else{
                sum+= Integer.parseInt(nums);
                nums="0";
            }
        }
        return sum + Integer.parseInt(nums);
    }
}
