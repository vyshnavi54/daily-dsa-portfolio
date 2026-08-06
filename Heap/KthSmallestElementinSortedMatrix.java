//Leetcode 378. Kth Smallest Element in a Sorted Matrix
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->Integer.compare(matrix[a[0]][a[1]],matrix[b[0]][b[1]]));
        for(int i=0;i<Math.min(k,matrix.length);i++){
            pq.add(new int[]{i,0});
        }      
        int ans[]=null;
        int kmin=0;
        for(int i=0;i<k;i++){
            ans=pq.poll();
            kmin=matrix[ans[0]][ans[1]];
            if(ans[1]+1<matrix.length)
            pq.add(new int[]{ans[0],ans[1]+1});
        }
        return kmin;
    }
}