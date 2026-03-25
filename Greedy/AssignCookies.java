//LeetCode 455. Assign Cookies
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int m=g.length,n=s.length;
        int l=0,r=0;
        while(l<n && r<m){
            if(g[r]<=s[l])
            r=r+1;
            l=l+1;
        }
        return r;
        
    }
}