//LeetCode 438. Find All Anagrams in a String
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> al=new ArrayList<>();
        int l1=p.length(),l2=s.length();
        if(l1>l2)return al;
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<l1;i++){
            freq1[s.charAt(i)-'a']++;
            freq2[p.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)) al.add(0);
        for(int j=l1;j<l2;j++){
            freq1[s.charAt(j)-'a']++;
            freq1[s.charAt(j-l1)-'a']--;
            if(Arrays.equals(freq1,freq2))
            al.add(j-l1+1);
        }
        return al;
    }
}