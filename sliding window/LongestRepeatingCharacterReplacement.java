//424. Longest Repeating Character Replacement
class Solution {
    public int characterReplacement(String s, int k) {
        int l=s.length(),i=0,j=0,maxfreq=0,len=0;
        int freq[]=new int[26];
        while(j<l){
            freq[s.charAt(j)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(j)-'A']);
            if(((j-i+1)-maxfreq)>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            else{
                len=Math.max(len,j-i+1);
            }
            j++;

        }
        return len;
    }
}