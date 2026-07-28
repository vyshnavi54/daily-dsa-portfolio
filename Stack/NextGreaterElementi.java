//LeetCode 496. Next Greater Element I
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        HashMap<Integer,Integer>hm=new HashMap<>();
        Stack<Integer>s=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!s.isEmpty() && nums2[i]>s.peek()){
                hm.put(s.pop(),nums2[i]);
            }
            s.push(nums2[i]);
        }
        while(!s.isEmpty()){
            hm.put(s.pop(),-1);
        }
        for(int i=0;i<nums1.length;i++){
            ans[i]=hm.get(nums1[i]);
        }
        return ans;
    }
}