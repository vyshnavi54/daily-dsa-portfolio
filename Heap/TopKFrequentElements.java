//LeetCode 347. Top K Frequent Elements
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
            (a,b)->a.getValue()-b.getValue()
        );
        for(Map.Entry<Integer,Integer> map:hm.entrySet()){
            if(pq.size()<k)
            pq.add(map);
            else{
                if(map.getValue()>pq.peek().getValue())
                {
                    pq.poll();
                    pq.add(map);
                }
            }
        }
        int ans[]=new int[k];
        for(int i=k-1;i>=0;i--){
            ans[i]=pq.poll().getKey();
        }
        return ans;
    }
}