class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int m=1,c=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                c++;
            }else c=1;
            m=Math.max(m,c);
        }
        return m;
    }
}