//Leetcode 948. Bag of Tokens
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length,score=0,j=tokens.length-1,i=0,maxscore=0;
        Arrays.sort(tokens);
        if(n==0)return 0;
        if(power<tokens[0])return 0;
        while(i<=j){
            if(power>=tokens[i])
            {
                score++;
                maxscore=Math.max(score,maxscore);
                power=power-tokens[i];
                i++;
            }
            else if(score>=1){
                power+=tokens[j];
                score--;
                j--;
            }
            else
            {
                return maxscore;
            }

        }
        return maxscore;
    }
}