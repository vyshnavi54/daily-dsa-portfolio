//LeetCode 76. Minimum Window Substring
class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>hm1=new HashMap<>();
        HashMap<Character,Integer>hm2=new HashMap<>();
        int slen=s.length(),tlen=t.length();
        for(int i=0;i<tlen;i++){
            hm1.put(t.charAt(i),hm1.getOrDefault(t.charAt(i),0)+1);
        }
        int j=0,i=0,l=0,si=0,c=0,minlen=Integer.MAX_VALUE;
        while(j<slen){
            hm2.put(s.charAt(j),hm2.getOrDefault(s.charAt(j),0)+1);
            if(hm1.containsKey(s.charAt(j)) && hm2.get(s.charAt(j)).equals(hm1.get(s.charAt(j))))
            c++;
            while(c==hm1.size()){
                if(j-i+1 < minlen){
                    minlen=j-i+1;
                    si=i;
                }
                int a=hm2.get(s.charAt(i))-1;
                hm2.put(s.charAt(i),a);
                if(hm2.containsKey(s.charAt(i)) && hm1.containsKey(s.charAt(i))&& hm1.get(s.charAt(i))>hm2.get(s.charAt(i)))c--;
                i++;
            }
            j++;
        }
        return (minlen==Integer.MAX_VALUE)?"":s.substring(si,si+minlen);

    }
}