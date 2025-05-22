// leetcode 1903. Largest Odd Number in String
class Solution {
    public String largestOddNumber(String num) {
        int l=num.length()-1;
        for(int i=l; i>=0; i--){
            int dig=num.charAt(i)-'0';
            if((dig & 1)==1){
                return num.substring(0,i+1);
            }
        } return "";
    }
}
