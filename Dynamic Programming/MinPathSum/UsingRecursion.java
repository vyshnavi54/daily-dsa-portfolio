//64.LeetCode
//Using Recursion
class Solution {
    public int minPathSum(int[][] grid) {
        return minsum(grid,grid.length-1,grid[0].length-1);
        
    }
    static int minsum(int[][] grid,int i,int j){
        if(i==0 && j==0){
            return grid[i][j];
        }
        if(i<0 || j<0)
        return Integer.MAX_VALUE;
        int u=minsum(grid,i-1,j);
        int l=minsum(grid,i,j-1);
        int s1=(u==Integer.MAX_VALUE)?Integer.MAX_VALUE:grid[i][j]+u;
        int s2=(l==Integer.MAX_VALUE)?Integer.MAX_VALUE:grid[i][j]+l;
        return Math.min(s1,s2);
    }
}