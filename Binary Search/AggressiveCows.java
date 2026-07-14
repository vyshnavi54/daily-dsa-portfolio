//Aggressive Cows
//GFG Problem
class Solution {
    public int aggressiveCows(int[] arr, int k) {
        // code here
        int n=arr.length,low=1;
        Arrays.sort(arr);
        int high=arr[n-1]-arr[0];
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(possible(arr,k,mid)){
                low=mid+1;
            }
            else
            high=mid-1;
        }
        return high;
        
    }
    boolean possible(int[] arr,int k,int distance){
        int placed=1,lastplaced=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[lastplaced]>=distance){
                lastplaced=i;
                placed++;
            }
        }
        return placed>=k?true:false;
    }
}