class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int x:nums)
        s.add(x);
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(s);
        if(s.size()<3)return pq.poll();
        
        for(int i=0;i<2;i++)pq.poll();
        return pq.poll();
    }
}