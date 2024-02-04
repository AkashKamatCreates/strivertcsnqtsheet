package org.akashkamat;

public class array17 {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 0, -4, -5};
        int answer = maxProduct(arr);
        System.out.println(answer);
    }
    public static int maxProduct(int[] nums) {

        /** Prefix and Suffix solution: */
        int n = nums.length;
        int prefix = 1;
        int suffix = 1;
        int ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(prefix==0) prefix=1;
            if(suffix==0) suffix=1;

            prefix*=nums[i];
            suffix*=nums[n-i-1];
            ans = Math.max(Math.max(prefix, suffix), ans);
        }

        return ans;

    }
}
