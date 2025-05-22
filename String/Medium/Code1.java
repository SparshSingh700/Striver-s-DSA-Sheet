//LEETCODE 151. Reverse Words in a String
class Solution {
    public String reverseWords(String s) {
        StringBuilder S = new StringBuilder();
        int start = 0;
        int left = s.length() - 1;
        int right = left;

        while (left >= start) {
            char cL = s.charAt(left);
            char cR = s.charAt(right);

            if (cR == ' ') {
                left--;
                right--;
            }
            else if (left == 0 || s.charAt(left - 1) == ' ') { 
                S.append(s.substring(left, right + 1)).append(" "); 
                left--; 
                right = left; 
            } else {
                left--;
            }
        }

        return S.toString().trim(); 
    }
}
