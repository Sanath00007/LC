class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] a1=new int[nums.length];
        int[] a2=new int [nums.length];
        int max=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            a1[i]=max;
        }
        for(int i=nums.length-1;i>=0;i--){
            min=Math.min(nums[i],min);
            a2[i]=min;
        }
        for(int i=0;i<nums.length;i++){
            int t=a1[i]-a2[i];
            if(t<=k)return i;
        }
        return -1;

    }
}