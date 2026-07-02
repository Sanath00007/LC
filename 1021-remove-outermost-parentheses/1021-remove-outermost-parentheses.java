class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int f=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
            if(f>0)sb.append(s.charAt(i));
            f++;
            }
            else {
                f--;
                if(f>0)sb.append(')');
            }
        
        }
        return sb.toString();
    }
}