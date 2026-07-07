//LeetCode 11. Container With Most Water
class Solution {
    public int maxArea(int[] height) {
        int i=0,n=height.length,j=n-1,maxv=0,m=0;
        while(i<j){
            m=Math.min(height[i],height[j])*(j-i);
            maxv=Math.max(m,maxv);
            if(height[i]<height[j])
            i++;
            else 
            j--;
        }
        return maxv;

    }
}