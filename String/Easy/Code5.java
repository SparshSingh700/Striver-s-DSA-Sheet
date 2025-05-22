// leetcode 796. Rotate String
class Solution {
    public boolean rotateString(String s, String goal) {
       int lG=goal.length();
       for(int i=0; i <lG; i++){
            if(s.charAt(0)==goal.charAt(i)){
                StringBuilder S= new StringBuilder();
                S=S.append(goal.substring(i, lG)).append(goal.substring(0,i));
                if (S.toString().equals(s)) return true;
                // if(S.toString() == s) == compares object references, not content,    when used on strings.
            }
       } return false;
    }
}
