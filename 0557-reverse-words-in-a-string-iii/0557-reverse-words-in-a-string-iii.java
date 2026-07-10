class Solution {
    public String reverseWords(String s) {
        String[] str=s.split(" ");
        String k="";
        for(int i=0;i<str.length;i++){
            for(int j=str[i].length()-1;j>=0;j--)
            k+=str[i].charAt(j);

            if (i != str.length - 1)
                k += " ";
        }
        return k;
        }
        
        
    }
