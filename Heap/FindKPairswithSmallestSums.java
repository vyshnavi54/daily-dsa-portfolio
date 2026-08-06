//LeetCode 373. Find K Pairs with Smallest Sums
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(nums1[a[0]]+nums2[a[1]],nums1[b[0]]+nums2[b[1]]));
        List<List<Integer>>al=new ArrayList<>();
        int ans[]=null;
        for(int i=0;i<Math.min(k,nums1.length);i++){
            pq.add(new int[]{i,0});
        }
        for(int i=0;i<k &&!pq.isEmpty();i++){
            ans=pq.poll();
            al.add(new ArrayList<>(List.of(nums1[ans[0]],nums2[ans[1]])));
            if(ans[1]+1<nums2.length){
                pq.add(new int[]{ans[0],ans[1]+1});                    
            }
        }
        return al;
    }
}