//Count Occurences in a Sorted Array
//GFG Problem
class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int n=arr.length;
        int f=firstoccurence(arr,target);
        return (f==n || arr[f]!=target)? 0: (lastoccurence(arr,target)-1)-f+1;
        
    }
    static int firstoccurence(int[] arr,int target){
        int low=0,n=arr.length,high=n-1,first=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=target){
                first=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return first;
    }
    static int lastoccurence(int[] arr,int target){
        int low=0,n=arr.length,high=n-1,last=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>target){
                last=mid;
                high=mid-1;
            }
            else
            low=mid+1;
        }
        return last;
    }
}
