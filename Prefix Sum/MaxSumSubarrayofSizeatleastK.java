//Max Sum Subarray of Size at least K
//GFG Problem
class Solution {
    public int maxSumWithK(int[] arr, int k) {
        // code here
        int n=arr.length;
        int prefix[]=new int[n+1];
        prefix[0]=0;
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+arr[i-1];
        }
        int minprefix=0,maxv=prefix[k];
        for(int j=k+1;j<=n;j++){
            minprefix=Math.min(prefix[j-k],minprefix);
            maxv=Math.max(maxv,prefix[j]-minprefix);
        }
        return maxv;
    }
}