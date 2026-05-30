//Ninja's Training (GFG)    [2D DP]
//solved using recursion
class Solution {
    public int maximumPoints(int mat[][]) {
        // code here
        return training(mat.length-1,3,mat);
        
    }
    static int training(int i,int last,int mat[][]){
        if(i==0){
            int maxi=0;
            for(int j=0;j<3;j++){
                if(j!=last){
                    maxi=Math.max(maxi,mat[i][j]);
                }
            }
            return maxi;
        }
        int maxi=0;
        for(int j=0;j<3;j++){
            if(j!=last){
                maxi=Math.max(mat[i][j]+training(i-1,j,mat),maxi);
            }
        }
        return maxi;
    }
}