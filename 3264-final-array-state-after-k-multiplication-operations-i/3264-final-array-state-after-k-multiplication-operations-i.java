class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int j=0;j<k;j++){
            int min=0,minv=Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i]<minv){min=i;minv=nums[i];}

            }
            nums[min]*=multiplier;
        }
        return nums;

    }
}