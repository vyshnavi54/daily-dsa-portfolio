//LeetCode 1094. Car Pooling
class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int m=trips.length,location=0;
        for(int[] trip :trips){
            location=Math.max(location,trip[2]);
        }
        int prefix[]=new int[location+1];
        for(int i=0;i<m;i++){
            int from=trips[i][1];
            int to=trips[i][2];
            prefix[from]+=trips[i][0];
            prefix[to]+=-trips[i][0];
        }
        if(prefix[0]>capacity)return false;
        for(int i=1;i<=location;i++){
            prefix[i]=prefix[i-1]+prefix[i];
            if(prefix[i]>capacity)
            return false;
        }
        return true;
    }
}