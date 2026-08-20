class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int c=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='-'){
                c++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
        }
        
        for(int i=sb.length()-k;i>0;i-=k){
            sb.insert(i,'-');
        }
        return sb.toString();

    }
}