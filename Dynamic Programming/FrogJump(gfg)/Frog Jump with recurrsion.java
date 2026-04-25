#Frog Jump(GFG problem)
#Using recursion
class Solution {
    int minCost(int[] height) {
        // code here
        return frog(height,height.length-1);
    }
    static int frog(int[] height,int f){
        if(f==0)
        return 0;
        int left=frog(height,f-1)+Math.abs(height[f]-height[f-1]);
        int right = Integer.MAX_VALUE;
        if(f>1)
        right=frog(height,f-2)+Math.abs(height[f]-height[f-2]);
        return Math.min(left,right);
    }
}