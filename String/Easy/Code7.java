//leetcode 1614. Maximum Nesting Depth of the Parentheses
class Solution {
    public int maxDepth(String s) {
        int l=s.length();
        int c=0, max=0;
        for(int i=0; i<l; i++){
            if(s.charAt(i)=='('){
                c++;
            }
            else if(s.charAt(i)==')'){
                c--;
            }
            max=Math.max(max,c);
        }
        return max; 
    }
}
