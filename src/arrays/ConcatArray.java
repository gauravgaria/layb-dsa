package arrays;

import java.util.Arrays;

public class ConcatArray {
    public static int[] concatenateArray(int[] nums){
        if(nums == null || nums.length < 1){
            return new int[]{};
        }
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i=0; i<n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,1,2};
        System.out.println(Arrays.toString(concatenateArray(nums)));
    }
}
