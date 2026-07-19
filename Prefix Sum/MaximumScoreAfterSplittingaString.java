//Leetcode 1422. Maximum Score After Splitting a String
class Solution {
    public int maxScore(String s) {
        int n=s.length(),tzeroes=0,tones=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0')
            tzeroes++;
            else
            tones++;
        }
        int leftz=0,lefto=0,maxv=0;
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)=='0')
            leftz++;
            else
            lefto++;
            maxv=Math.max(maxv,leftz+(tones-lefto));
        }
        return maxv;

    }
}