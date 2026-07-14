//LeetCode 1482. Minimum Number of Days to Make m Bouquets
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<(long)m *k)return -1;
        int low=Integer.MAX_VALUE,high=-1;
        for(int i=0;i<n;i++){
            low=Math.min(low,bloomDay[i]);
            high=Math.max(high,bloomDay[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(bloomDay,m,k,mid))
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
    }
    static boolean possible(int[] bloomDay,int m,int k,int days){
        int k1=0,m1=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=days){
                k1++;
            }
            else
            k1=0;
            if(k1==k){
                m1++;
                k1=0;
            }
            if(m1==m)
            return true;
        }
        return false;
    }
}