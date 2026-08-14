class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0,max=0;
        for(int i=0;i<s.length();i++){
           map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            while(map.get(s.charAt(i))>2){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}