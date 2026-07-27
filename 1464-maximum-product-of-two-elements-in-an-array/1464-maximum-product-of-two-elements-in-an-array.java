class Solution {
    public int maxProduct(int[] nums) {
        int n1=0,n2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=n1){
                n2=n1;
                n1=nums[i];
            }else if(nums[i]>n2&&nums[i]!=n1)n2=nums[i];
            
        }
        return (n1-1)*(n2-1);
    }
}