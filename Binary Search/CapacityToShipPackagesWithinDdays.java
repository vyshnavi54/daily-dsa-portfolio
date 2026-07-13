//LeetCode 1011. Capacity To Ship Packages Within D Days
class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length,low=-1,high=0;
        for(int i=0;i<n;i++){
            high+=weights[i];
            low=Math.max(low,weights[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canreach(weights,days,mid))
            high=mid-1;
            else
            low=mid+1;
        }
        return low;
    }
    static boolean canreach(int[] weights, int days,int capacity){
        int currwt=0,d=1;
        for(int i=0;i<weights.length;i++){
            if(currwt+weights[i] > capacity){
                d++;
                currwt=weights[i];
            }
            else
            currwt+=weights[i];
        }
        return d<=days?true:false;
    }
}