package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static boolean hasDuplicate(int[] nums){
        if(nums == null || nums.length < 1){
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
    public static void main(String[] args) {
        int[] nums = new int[]{1,4,11,2};
        System.out.println(hasDuplicate(nums));
    }
}
