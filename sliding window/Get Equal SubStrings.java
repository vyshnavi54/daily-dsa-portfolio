#LeetCode 1208.Get Equal SubStrings Within Budget
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int l=0,r=0,n=s.length(),maxlen=0, c=0;
        while(r<n){
            c=c+Math.abs(s.charAt(r)-t.charAt(r));
            if(c<=maxCost){
                maxlen=Math.max(maxlen,l-r+1);
            }
            else{
                c=c-Math.abs(s.charAt(r)-t.charAt(r));
                l++;
            }
            r++;

        }
        return maxlen;
        
    }
}