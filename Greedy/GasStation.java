//LeetCode134. Gas Station
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0,start=0,tank=0;
        for(int i=0;i<gas.length;i++){
            tank+=gas[i]-cost[i];
            total+=gas[i]-cost[i];
            if(tank<0){
                tank=0;
                start=i+1;
            }
        }
        if(total<0)return -1;
        return start;
    }
}