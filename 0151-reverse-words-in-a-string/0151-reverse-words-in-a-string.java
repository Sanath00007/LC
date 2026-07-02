class Solution {
    public String reverseWords(String s) {
        String[] st=s.trim().split("\\s+");
        String k="";
        for(int i=st.length-1;i>0;i--){
            k+=st[i]+ " ";
        }
        return k+st[0];
    }
}