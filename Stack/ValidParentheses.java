//Leetcode 20. Valid Parentheses
class Solution {
    public boolean isValid(String s) {
        Stack<Character>st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='('||ch=='{'||ch=='[')
            st.push(ch);
            else if(!st.isEmpty()){
                char a=st.pop();
                if(ch==')' && a!='(' || 
                   ch==']' && a!='[' ||
                   ch=='}' && a!='{' )
                return false;
            }
            else
            return false;
        }
        return st.isEmpty();
    }
}