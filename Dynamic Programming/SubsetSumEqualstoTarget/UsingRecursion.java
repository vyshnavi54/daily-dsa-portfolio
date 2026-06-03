//GFG Problem
//Using Recursion
class Solution {
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        return isexist(arr,k,arr.length-1);
        
    }
    static boolean isexist(int[] arr,int k,int i){
        if(k==arr[i])
        return true;
        if(i==0){
            if(arr[i]==k)
            return true;
            return false;
        }
        boolean take=isexist(arr,k,i-1);
        boolean nottake=false;
        if(k>arr[i]){
            nottake=isexist(arr,k-arr[i],i-1);
        }
        return (take||nottake);
    }
}