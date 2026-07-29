//LeetCode 503. Next Greater Element II
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer>st=new Stack<>();
        int n=nums.length;
        int ans[]=new int[n];
        for(int i=0;i<2*n;i++){
            while(!st.isEmpty() && nums[i%n]>nums[st.peek()]){
                ans[st.pop()]=nums[i%n];
            }
            if(i<n) st.push(i%n);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
    }
}