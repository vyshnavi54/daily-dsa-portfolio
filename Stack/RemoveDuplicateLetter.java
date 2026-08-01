//LeetCode 316. Remove Duplicate Letters
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        boolean[] present=new boolean[26];
        Stack<Character>st=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            while(!st.isEmpty() && !present[ch-'a']&& st.peek()>ch && freq[st.peek()-'a']>0){
                char c=st.pop();
                present[c-'a']=false;
            }
            if(!present[ch-'a']){
                st.push(ch);
                present[ch-'a']=true;
            }
            freq[ch-'a']--;
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}