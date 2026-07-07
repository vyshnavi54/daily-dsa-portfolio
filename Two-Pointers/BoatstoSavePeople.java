//LeetCode 881. Boats to Save People
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length,i=0,j=n-1,boat=0;
        Arrays.sort(people);
        while(i<=j){
            if(people[i]+people[j]<=limit)
            {
                boat++;
                i++;j--;
            }
            else{
                boat++;
                j--;
            }
        }
        return boat;
    }
}