//LeetCode 74. Search a 2D Matrix
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length,l=0,h=(m*n)-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]<target)
            l=mid+1;
            else if(matrix[row][col]>target)
            h=mid-1;
            else
            return true;
        }
        return false;
        
    }
}