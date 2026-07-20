//Leetcode 2381. Shifting Letters II
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int prefix[]=new int[n+1];
        int m=shifts.length;
        for(int i=0;i<m;i++){
            int from=shifts[i][0];
            int to=shifts[i][1];
            int direction=shifts[i][2];
            if(direction==0){
                prefix[from]+=-1;
                prefix[to+1]-=-1;
            }
            else{
                prefix[from]+=1;
                prefix[to+1]-=1;
            }
        }
        for(int i=1;i<n;i++){
            prefix[i]+=prefix[i-1];
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append((char)('a'+((s.charAt(i)-'a'+prefix[i]%26+26)%26)));
        }
        return sb.toString();
    }
}