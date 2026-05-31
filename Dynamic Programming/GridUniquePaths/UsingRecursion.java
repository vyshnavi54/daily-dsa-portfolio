//LeetCode 62
//solved using recursion

class Solution {
    public int uniquePaths(int m, int n) {
       return count(m-1,n-1);
    }
    static int count(int i,int j){
        if(i==0 && j==0)
        return 1;
        if(i<0 || j<0)
        return 0;
        int up=count(i-1,j);
        int left=count(i,j-1);
        return up+left;

    }
}