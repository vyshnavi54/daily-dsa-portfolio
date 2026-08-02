//Leetcode 42. Trapping Rain Water
class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmax[]=new int[n];
        int rightmax[]=new int[n];
        int maxv=height[0];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            maxv=Math.max(maxv,height[i]);
            leftmax[i]=maxv;
        }
        maxv=height[n-1];
        rightmax[n-1]=maxv;
        for(int i=n-2;i>=0;i--){
            maxv=Math.max(maxv,height[i]);
            rightmax[i]=maxv;
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.min(rightmax[i],leftmax[i])-height[i];
        }
        return ans;
    }
}