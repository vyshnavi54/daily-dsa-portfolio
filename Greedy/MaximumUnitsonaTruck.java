//Leetcode 1710. Maximum Units on a Truck
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes,(a,b)->Integer.compare(b[1],a[1]));
        int units=0;
        for(int i=0;i<boxTypes.length;i++){
            if(truckSize>0){
                int taken=Math.min(truckSize,boxTypes[i][0]);
                truckSize-=taken;
                units+=taken*boxTypes[i][1];
            }
            else
            return units;
        }
        return units;
    }
}