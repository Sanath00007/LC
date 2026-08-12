class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                 map.put(nums[i],map.get(nums[i])+1);
               
            }else{
                map.put(nums[i],1);
            }
             while(map.get(nums[i])>k){
                map.put(nums[l],map.get(nums[l])-1);
                l++;
             }
             ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}