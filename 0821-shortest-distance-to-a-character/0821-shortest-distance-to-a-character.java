class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] ans=new int[s.length()];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c)list.add(i);
        }
        for(int i=0;i<ans.length;i++){
            int min=Integer.MAX_VALUE;
            for(int j=0;j<list.size();j++){
                min=Math.min(min,Math.abs(list.get(j)-i));
                

            }
            ans[i]=min;
            
        }
        return ans;

    }
}