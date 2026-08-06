//LeetCode 502. IPO
class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]>profitheap=new PriorityQueue<>((a,b)->b[0]-a[0]);
        PriorityQueue<int[]>capitalheap=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int i=0;i<capital.length;i++){
            capitalheap.add(new int[]{profits[i],capital[i]});
        }
        for(int i=0;i<k;i++){
            while(!capitalheap.isEmpty() && capitalheap.peek()[1]<=w){
                profitheap.add(capitalheap.poll());
            }
            if(!profitheap.isEmpty()){
                int ans[]=profitheap.poll();
                w+=ans[0];
            }
        }
        return w;
    }
}