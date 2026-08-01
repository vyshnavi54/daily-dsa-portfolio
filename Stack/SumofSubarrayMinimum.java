//Leetcode 907. Sum of Subarray Minimums
class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int mod=1000000007;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i]=-1;
            }
            else
            left[i]=st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
            st.pop();
            if(st.isEmpty())
            right[i]=n;
            else
            right[i]=st.peek();
            st.push(i);
        }
        long ans=0;
        for(int i=0;i<n;i++){
            long a=1L*arr[i]*(i-left[i])*(right[i]-i);
            ans=(ans+a)%mod;
        }
        return (int)ans;
    }
}