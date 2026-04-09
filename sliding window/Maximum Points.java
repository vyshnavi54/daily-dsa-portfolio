#LeetCode 1423. Maximum Points You Can Obtain from Cards
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int l=0,r=cardPoints.length-1,s=0,maxscore=0;
        for(int i=0;i<k;i++){
            s=s+cardPoints[i];
        }
        maxscore=s;
        for(int i=k-1;i>=0;i--){
            s=s-cardPoints[i];
            s=s+cardPoints[r];
            r--;
            maxscore=Math.max(s,maxscore);

        }
        return maxscore;
    }
}