//LeetCode 72
//Using Recursion
class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length(),n2=word2.length();
        return count(n1-1,n2-1,word1,word2);
        
    }
    static int count(int i,int j,String s1,String s2){
        if(i<0)
        return j+1;
        if(j<0)
        return i+1;
        if(s1.charAt(i)==s2.charAt(j))
        return 0+count(i-1,j-1,s1,s2);
        int insert=1+count(i,j-1,s1,s2);
        int update=1+count(i-1,j-1,s1,s2);
        int delete=1+count(i-1,j,s1,s2);
        return Math.min(insert,Math.min(update,delete));
    }

}