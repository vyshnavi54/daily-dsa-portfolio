//LeetCode 1092
//Using Tabulation
class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int n1=str1.length(),n2=str2.length();
        int dp[][]=new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                else
                dp[i][j]=0+Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        String s="";
        int i=n1,j=n2;
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)){
                s=s+str1.charAt(i-1);
                i--;
                j--;
            }
            else
            {
                if(dp[i-1][j]>=dp[i][j-1]){
                    s=s+str1.charAt(i-1);
                    i--;
                }
                else
                {
                    s=s+str2.charAt(j-1);
                    j--;   
                }  
            }
        }
        while(i>0){
            s=s+str1.charAt(i-1);
            i--;
        }
        while(j>0){
            s=s+str2.charAt(j-1);
            j--;
        }
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    }
}