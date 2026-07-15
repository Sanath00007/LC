class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set =new HashSet<>();
     HashSet<Integer> n=new HashSet<>();
        if(nums1.length<nums2.length){
            for(int i=0;i<nums1.length;i++){
                set.add(nums1[i]);
            }
            
        
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])&&(!n.contains(nums2[i])))n.add(nums2[i]);
        }
        }else{
            for(int i=0;i<nums2.length;i++){
                set.add(nums2[i]);
            }
            
           
        
        for(int i=0;i<nums1.length;i++){
            if(set.contains(nums1[i])&&(!n.contains(nums1[i])))n.add(nums1[i]);
        }
        }
        int[] ans=new int[n.size()];
        int k=0;
        for(int x:n){
            ans[k++]=x;
        }
        return ans;
        
    }
}