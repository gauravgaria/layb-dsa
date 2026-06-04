package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    /** Important constraint: s and t consist of lowercase English letters. **/

    // Brute force: TC-> O(n log n) SC -> O(n)
    public static boolean isAnagramBrute(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    // Hashmap: TC-> O(1) SC -> O(1)
    public static boolean isAnagramHashmap(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> frequency = new HashMap<>();
        for(char sChar: s.toCharArray()){
            frequency.put(sChar, frequency.getOrDefault(sChar,0) + 1);
        }

        for(char tChar: t.toCharArray()){
            if(!frequency.containsKey(tChar)){
                return false;
            }
            frequency.put(tChar, frequency.get(tChar) - 1);

            if(frequency.get(tChar) == 0){
                frequency.remove(tChar);
            }
        }
        return frequency.isEmpty();
    }

    // Arrays: TC-> O(1) SC -> O(1)
    public static boolean isAnagramOptimal(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] frequency = new int[26];   // constraint is lowercase only

        for(int i=0; i<s.length(); i++){
            frequency[s.charAt(i) - 'a']++;
            frequency[t.charAt(i) - 'a']--;
        }
        for (int count: frequency){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    static void main() {
        String s = "racecar";
        String t = "carrace";
        //System.out.println(isAnagramBrute(s,t));
        System.out.println(isAnagramOptimal(s,t));
    }
}
