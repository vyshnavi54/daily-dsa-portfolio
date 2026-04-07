#LeetCode 567. Permutation in String
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] f1=new int[26];
        int[] f2=new int[26];
        int m=s1.length();
        int n=s2.length();
        for(int i=0;i<m;i++){
            f1[s1.charAt(i)-'a']++;
            
        }
        for(int i=0;i<m&&i<n;i++){
            
            f2[s2.charAt(i)-'a']++;
        }

        if(Arrays.equals(f1,f2))
        return true;
        for(int i=m;i<n;i++){
            f2[s2.charAt(i)-'a']++;
            f2[s2.charAt(i-m)-'a']--;
            if(Arrays.equals(f1,f2))
            return true;
        }
        return false;
        
    }
}