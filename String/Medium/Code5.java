//Leetcode 5. Longest Palindromic Substring
class Solution {
    public String longestPalindrome(String s) {
        int l = s.length();
        if (l == 0) return "";

        int start = 0, end = 0;

        for (int i = 0; i < l; i++) {
            int len1 = expandFromCenter(s, i, i);      // for odd 
            int len2 = expandFromCenter(s, i, i + 1);   //for even
            int len = Math.max(len1, len2);

            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expandFromCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; 
    }
}
