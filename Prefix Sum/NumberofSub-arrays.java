//LeetCode 1524. Number of Sub-arrays With Odd Sum
class Solution {
    public int numOfSubarrays(int[] arr) {
        int n=arr.length;
        int prefix[]=new int[n];
        int mod=1000000007;
        prefix[0]=arr[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        long count=0,even=0,odd=0;
        for(int i=0;i<n;i++){
            if(prefix[i]%2!=0){
                odd++;
                count=(count+even+1)%mod;
            }
            else{
                even++;
                count=(count+odd)%mod;
            }
        }
        return (int)count;
    }
}