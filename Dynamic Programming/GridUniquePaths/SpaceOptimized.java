//SpaceOptimized
class Solution {
    public int uniquePaths(int m, int n) {
        int a[]=new int[n];
        int temp=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0)
                a[0]=temp;
                else{
                    int u=0,l=0;
                    if(i>0)
                    u=a[j];
                    if(j>0)
                    l=temp;
                    a[j]=u+l;
                }
                temp=a[j];
            }
        }
        return a[n-1];
    }
}