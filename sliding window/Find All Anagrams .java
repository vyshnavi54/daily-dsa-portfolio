#LeetCode 438. Find All Anagrams in a String
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int m=p.length();
        int[] f1=new int[26];
        int[] f2=new int[26];
        for(int i=0;i<m;i++){
            f2[p.charAt(i)-'a']++;
        }
        for(int i=0;i<m&&i<n;i++){
            f1[s.charAt(i)-'a']++;
        }
        ArrayList<Integer>al=new ArrayList<>();
        if(Arrays.equals(f1,f2))
        al.add(0);
        for(int i=m;i<n;i++){
            f1[s.charAt(i)-'a']++;
            f1[s.charAt(i-m)-'a']--;
            if(Arrays.equals(f1,f2))
            al.add(i-m+1);

        }
        return al;
    }
}