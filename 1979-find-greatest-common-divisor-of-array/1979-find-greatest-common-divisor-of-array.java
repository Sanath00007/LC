class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max)max=nums[i];
            if(nums[i]<min)min=nums[i];
        }
        int ans=gcd(min,max);
        return ans;
    }
    public static int gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}