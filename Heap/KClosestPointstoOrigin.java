//LeetCode 973. K Closest Points to Origin
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->(b[0]*b[0]+b[1]*b[1])-(a[0]*a[0]+a[1]*a[1]));
        for(int i=0;i<points.length;i++){
            if(pq.size()<k)
            pq.add(points[i]);
            else{
                if((points[i][0]*points[i][0]+points[i][1]*points[i][1])<(pq.peek()[0]*pq.peek()[0]+pq.peek()[1]*pq.peek()[1]))
                {
                    pq.poll();
                    pq.add(points[i]);
                }
            }
        }
        int ans[][]=new int[k][2];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
            
        }
        return ans;
    }
}