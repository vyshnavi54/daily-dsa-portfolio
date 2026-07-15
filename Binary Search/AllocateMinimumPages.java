//Allocate Minimum Pages
//GFG Problem
class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        long low=0,high=0;
        if(n<k)return -1;
        for(int i=0;i<n;i++){
            low=Math.max(low,arr[i]);
            high=high+arr[i];
        }
        while(low<=high){
            long mid=(low+(high-low)/2);
            if(possible(arr,k,mid))
            high=mid-1;
            else
            low=mid+1;
        }
        return (int)low;
        
        
    }
    static boolean possible(int[] arr,int k, long val){
        int n=arr.length,curr=0,s=1;
        for(int i=0;i<n;i++){
            if(curr+arr[i]>val){
                curr=arr[i];
                s++;
            }
            else{
                curr=curr+arr[i];
            }
            
        }
        return s<=k?true:false;
    }
}