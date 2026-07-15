//The Painter's Partition Problem-II
//GFG Problem
class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int n=arr.length;
        long low=0,high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,arr[i]);
            high=high+arr[i];
        }
        while(low<=high){
            long mid=low+(high-low)/2;
            if(possible(arr,k,mid))
            high=mid-1;
            else
            low=mid+1;
        }
        return (int)low;
    }
    static boolean possible(int[] arr,int k,long time){
        int n=arr.length,curr=0,k1=1;
        for(int i=0;i<n;i++){
            if(curr+arr[i]>time){
                k1++;
                curr=arr[i];
            }
            else
            curr=curr+arr[i];
        }
        return k1<=k;
    }
}
