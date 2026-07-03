//LeetCode 125. Valid Palindrome(Using Two-Pointer)
class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String s1="";
        int n=s.length();
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            if(Character.isLetterOrDigit(a)){
                s1=s1+a;
            }
        }
        n=s1.length();
        int i=0,j=n-1;
        while(i<=j){
            if(s1.charAt(i)!=s1.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}