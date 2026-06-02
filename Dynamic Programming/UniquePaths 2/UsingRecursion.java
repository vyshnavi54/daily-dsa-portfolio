//63.LeetCode
//Using Recursion
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return count(obstacleGrid.length-1,obstacleGrid[0].length-1,obstacleGrid);
        
    }
    static int count(int i,int j,int[][] a){
        if(i==0 && j==0 && a[i][j]!=1)
        return 1;
        if(i<0 || j<0 || a[i][j]==1)
        return 0;
        int u=count(i-1,j,a);
        int l=count(i,j-1,a);
        return l+u;
    }
}