//LeetCode 1046. Last Stone Weight
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int s1=pq.poll();
            int s2=pq.poll();
            if(s1!=s2)
            pq.add(s1-s2);
        }
        if(pq.isEmpty())
        return 0;
        return pq.poll();
    }
}