class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int f=0;
        for(int i=0;i<word.length();i++){
            sb.append(word.charAt(i));
            if(word.charAt(i)==ch&&f==0){sb.reverse();f=1;}
        }
        return sb.toString();
    }
}