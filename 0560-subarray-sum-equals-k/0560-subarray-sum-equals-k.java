class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] p=new int[nums.length];
        HashMap<Integer,Integer> map=new HashMap<>();
        p[0]=nums[0];
        map.put(0,1);
        for(int i=1;i<p.length;i++){
            p[i]=p[i-1]+nums[i];
            
        }
        
        int ct=0;
        for(int i=0;i<p.length;i++){
            for(int j=i;j<p.length;j++){
                int sum;
                if(i==0)sum=p[j];
                else{
                    sum=p[j]-p[i-1];
                }
                if(sum==k)ct++;
            }
            
        }
        return ct;
        
    }
}