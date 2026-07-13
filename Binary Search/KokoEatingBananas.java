//LeetCode 875. Koko Eating Bananas
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length,low=1,high=-1;
        for(int i=0;i<n;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canfinish(piles,h,mid,n)){
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return low;
        
    }
    static boolean canfinish(int[] piles, int h,int k,int n){
        int ans=0;
        for(int i=0;i<n;i++){
            ans=ans+(piles[i]+k-1)/k;
            if(ans>h)
            return false;
        }
        return true;
    }
}