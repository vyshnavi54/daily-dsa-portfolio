//LeetCode 2055. Plates Between Candles
class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n=s.length(),m=queries.length;
        int ans[]=new int[m];
        int next[]=new int[n];
        int prev[]=new int[n];
        int prefix[]=new int[n];
        prev[0]=(s.charAt(0)=='|')?0:-1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='|')
            prev[i]=i;
            else
            prev[i]=prev[i-1];
        }
        next[n-1]=(s.charAt(n-1)=='|')?n-1:-1;
        for(int i=n-2;i>=0;i--){
            if(s.charAt(i)=='|')
            next[i]=i;
            else
            next[i]=next[i+1];
        }
        if(s.charAt(0)=='*')prefix[0]=1;
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='*')
            prefix[i]=prefix[i-1]+1;
            else
            prefix[i]=prefix[i-1];
        }
        for(int i=0;i<m;i++){
            int left=next[queries[i][0]];
            int right=prev[queries[i][1]];
            if(left <0 || right<0 || left>=right)ans[i]=0;
            else ans[i]=prefix[right]-prefix[left];
        }
        return ans;
    }
}