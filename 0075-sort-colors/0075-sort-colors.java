class Solution {
    public void sortColors(int[] nums) {
        int o=0,t=0,z=0;
        for(int i=0;i<nums.length;i++){
            switch(nums[i]){
                case 0:z++;
                break;
                case 1:o++;
                break;
                case 2:t++;
                break;
            }
        }
        int i=0;
        while(z>0){
            nums[i++]=0;
            z--;
        }
        while(o>0){
            nums[i++]=1;
            o--;
        }
        while(t>0){
            nums[i++]=2;
            t--;
        }
    }
}