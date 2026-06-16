//Leetcode 115
//Using Recursion
class Solution {
    public int numDistinct(String s, String t) {
        int n1=s.length(),n2=t.length();
        return count(n1-1,n2-1,s,t);
        
    }
    static int count(int i,int j,String s,String t){
        if(j<0)return 1;
        if(i<0)return 0;
        if(s.charAt(i)==t.charAt(j))
        return count(i-1,j-1,s,t)+count(i-1,j,s,t);
        else
        return count(i-1,j,s,t);

    }
}