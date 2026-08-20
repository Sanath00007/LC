class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums1)
        map.put(x,map.getOrDefault(x,0)+1);
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i])&&map.get(nums2[i])>0){
                l.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i])-1);
            }
        }
        return l.stream().mapToInt(Integer::intValue).toArray();
        
    }
    
}