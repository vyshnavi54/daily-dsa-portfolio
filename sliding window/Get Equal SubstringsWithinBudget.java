//LeetCode 1208. Get Equal Substrings Within Budget
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int i=0,j=0,n=s.length(),maxlen=0,c=0;
        while(j<n){
            c=c+Math.abs(s.charAt(j)-t.charAt(j));
            while(c>maxCost){
                c=c-Math.abs(s.charAt(i)-t.charAt(i));
                i++;
            }
            maxlen=Math.max(maxlen,j-i+1);
            j++;
        }
        return maxlen;
    }
}