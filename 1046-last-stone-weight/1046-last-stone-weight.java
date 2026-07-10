class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int temp,sum=0;
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        if(pq.size()<2)return pq.poll();
        int i=0;
        while(pq.size()>1){
            int t1=pq.poll();
            int t2=pq.poll();
            if(t1!=t2)
            pq.add(t1-t2);
            else pq.add(0);
            
            
        }
        return pq.poll();

    }
}