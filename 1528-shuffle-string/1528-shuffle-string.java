class Solution {
    public String restoreString(String s, int[] indices) {
        char c[]=new char[s.length()];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<indices.length;i++){
            c[indices[i]]=s.charAt(i);
        }
        sb.append(c);
        return sb.toString();
    }
}