class Solution {
    public int pivotIndex(int[] nums) {
        int[]  ls=new int[nums.length];
        int[] rs=new int[nums.length];
        ls[0]=0;
        for(int i=0;i<nums.length-1;i++){
            ls[i+1]=ls[i]+nums[i];
        }
        rs[nums.length-1]=0;
        for(int i=nums.length-1;i>0;i--){
            rs[i-1]=rs[i]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(rs[i]==ls[i])return i;
        }

        return -1;
    }
}