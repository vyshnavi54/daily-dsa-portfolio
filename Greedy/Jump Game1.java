//Jump Game(GFG)
class Solution {
    // Function to check if we can reach the last index from the 0th index.
    public boolean canReach(int[] arr) {
        // code here
        int maxindex=0,i=0;
        while(i<arr.length && i<=maxindex){
            int s=arr[i]+i;
            if(s>=arr.length)return true;
            if(s>maxindex)
            maxindex=s;
            i++;
            
        }
        return false;
    }
}