//LeetCode 239. Sliding Window Maximum
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int n=nums.length;
       int arr[]=new int[n-k+1];
       Deque<Integer> dq=new ArrayDeque<>();
       for(int j=0;j<n;j++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[j]){
                 dq.pollLast();
            }
            dq.addLast(j);
            if(dq.peekFirst()<j-k+1)
            dq.pollFirst();
            if(j>=k-1)
            arr[j-k+1]=nums[dq.peekFirst()];
       }
       
       return arr;
    }
   
}