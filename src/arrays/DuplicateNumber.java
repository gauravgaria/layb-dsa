package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    // TC: O(n) and SC: O(n)
    // So If there is optimization on memory or memory constraint go for sorting approach
    public static boolean hasDuplicate(int[] nums){
        if(nums == null || nums.length == 0){
            return false;
        }
        Set<Integer> seen = new HashSet<Integer>();
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    // TC: n log n and SC: O(1)
    public static boolean hasDuplicateUsingSorting(int[] nums){
        if(nums == null || nums.length == 0){
            return false;
        }
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,1,2};
        System.out.println(hasDuplicate(nums));
        System.out.println(hasDuplicateUsingSorting(nums));
    }
}
