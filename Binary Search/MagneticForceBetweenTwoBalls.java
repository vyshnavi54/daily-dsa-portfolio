//LeetCode 1552. Magnetic Force Between Two Balls
class Solution {
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);
        int low=1,high=position[n-1]-position[0];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(possible(position,m,mid))
            low=mid+1;
            else
            high=mid-1;
        }
        return high;
        
    }
    static boolean possible(int[] position,int m,int force){
        int placed=1,lastplaced=0;
        for(int i=1;i<position.length;i++){
            if(position[i]-position[lastplaced]>=force){
                lastplaced=i;
                placed++;
            }
            if(placed==m)
            return true;
        }
        return false;
    }
}