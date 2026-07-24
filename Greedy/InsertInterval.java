//Leetcode 57. Insert Interval
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]>al=new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
           if(intervals[i][1]<newInterval[0]){
                al.add(intervals[i]);
           }
           else if(newInterval[1]<intervals[i][0]){
                al.add(newInterval);
                for(int j=i;j<intervals.length;j++){
                    al.add(intervals[j]);
                }
                return al.toArray(new int[al.size()][]);
           }
           
           else{
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
           }
        }
        al.add(newInterval);
        return al.toArray(new int[al.size()][]);
    }
}