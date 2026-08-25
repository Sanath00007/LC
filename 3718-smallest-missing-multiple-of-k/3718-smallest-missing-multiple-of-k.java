class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new  HashSet<>();
        for(int x:nums)set.add(x);
        int i=1;
        while(k!=0){
            if(!set.contains(k*i))return k*i;
            i++;
        }
        return 0;
    }
}