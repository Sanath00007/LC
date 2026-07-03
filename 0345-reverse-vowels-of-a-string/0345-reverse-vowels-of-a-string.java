class Solution {
    public String reverseVowels(String s) {
        HashSet <Character> set=new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] w=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            while(!set.contains(s.charAt(i))&&i<j)i++;
            while(!set.contains(s.charAt(j))&&i<j)j--;
            char temp=w[i];
            w[i]=w[j];
            w[j]=temp;
            i++;
            j--;
            
        }
        String ans=new String(w);
        return ans;
    }
}