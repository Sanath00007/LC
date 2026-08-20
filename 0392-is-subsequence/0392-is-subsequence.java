class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while(i!=-1){
            if(i==s.length())return true;
            if(j==t.length())return false;
            
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return false;
    }
}