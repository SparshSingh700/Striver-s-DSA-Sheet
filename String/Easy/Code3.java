//Leetcode 14. Longest Common Prefix
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i); // Current character in first string

            for (int j = 1; j < strs.length; j++) {
                // If i exceeds current string length OR character mismatch
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }

        return strs[0]; 
    }
}
// checking vertically here
//StringBuilder is mutable and assigned by reference, so both S and Strs refer to the same object. When you clear Strs, you also clear S.
