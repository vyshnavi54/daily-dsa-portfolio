//Leetcode 1143.Longest Common Subsequence
//Using Recursion
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1=text1.length();
        int n2=text2.length();
        return lcs(n1-1,n2-1,text1,text2);
    }
    static int lcs(int i,int j,String s1,String s2){
        if(i<0||j<0)
        return 0;
        if(s1.charAt(i)==s2.charAt(j))
        return 1+lcs(i-1,j-1,s1,s2);
        return 0+Math.max(lcs(i-1,j,s1,s2),lcs(i,j-1,s1,s2));
    }
}