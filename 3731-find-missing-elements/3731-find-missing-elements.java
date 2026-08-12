class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list=new ArrayList<Integer>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        HashSet<Integer> map=new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)min=nums[i];
             if(nums[i]>max)max=nums[i];
             map.add(nums[i]);
        }
        for(int i=min;i<max;i++){
            if(!map.contains(i))list.add(i);
        }
        return list;

    }
}