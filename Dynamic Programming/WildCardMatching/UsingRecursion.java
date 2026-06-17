//LeetCode 44
//Using Recursion
class Solution {
    public boolean isMatch(String s, String p) {
        int n1=s.length(),n2=p.length();
        return wildcard(n1-1,n2-1,s,p);
    }
    static boolean wildcard(int i,int j,String s,String p){
        if(i<0 && j<0) return true;
        if(j<0 && i>=0) return false;
        if(j>=0 && i<0){
            for(int k=j;k>=0;k--){
                if(p.charAt(k)!='*')
                return false;
            }
            return true;
        }
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?')
        return wildcard(i-1,j-1,s,p);
        else if(p.charAt(j)=='*')
        return wildcard(i,j-1,s,p)||wildcard(i-1,j,s,p);
        else
        return false;
    }
}