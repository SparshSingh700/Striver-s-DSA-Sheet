//Leetcode 1021. Remove Outermost Parentheses.
class Solution {
    public String removeOuterParentheses(String s) {
       StringBuilder S=new StringBuilder();
       int c=0;
       for(int i=0; i<s.length(); i++){
        if(s.charAt(i)=='('){
            if(c==0) c++;
            else{
                S=S.append("(");
                c++;
            }
        }
        else{
            if(c<=1) c--;
            else{
                S=S.append(")");
                c--;
            }
        }
       } return S.toString(); 
    }
}
