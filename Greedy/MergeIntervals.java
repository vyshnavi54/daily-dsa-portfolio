//Leetcode 56. Merge Intervals
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> al =new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int[] merged=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(merged[1]>=intervals[i][0]){
                merged[1]=Math.max(intervals[i][1],merged[1]);
            }
            else{
                al.add(new int[]{merged[0],merged[1]});
                merged=intervals[i];
            }
        }
        al.add(merged);
        return al.toArray(new int[al.size()][]);
    }
}