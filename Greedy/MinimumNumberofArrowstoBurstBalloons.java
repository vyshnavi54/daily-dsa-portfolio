//Leetcode 452. Minimum Number of Arrows to Burst Balloons
class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->
            Integer.compare(a[1],b[1])
        );
        int current[]=points[0];
        int ans=1;
        for(int i=1;i<points.length;i++){
            if(current[1]<points[i][0]){
                ans++;
                current=points[i];
            }
        }
        return ans;
    }
}