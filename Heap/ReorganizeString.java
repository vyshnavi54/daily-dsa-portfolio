//LeetCode 767. Reorganize String
class Solution {
    public String reorganizeString(String s) {
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        int freq[]=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0)
            pq.add(new int[]{i,freq[i]});
        }
        int prev[]=null;
        int curr[]=null;
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            curr=pq.poll();
            sb.append((char)(curr[0]+'a'));
            curr[1]--; 
            if(prev!=null && prev[1]>0)
            pq.add(prev);
            prev=curr;
        }
        if(sb.length()<s.length())
        return "";
        return sb.toString();
    }
}