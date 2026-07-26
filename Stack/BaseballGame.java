//Leetcode 682. Baseball Game
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].matches("-?\\d+")){
                st.push(Integer.parseInt(operations[i]));
            }
            else if(!st.isEmpty()){
                if(operations[i].equals("+") && st.size()>=2){
                    int a=st.pop(),b=st.pop();
                    st.push(b);
                    st.push(a);
                    st.push(a+b);
                }
                else if(operations[i].equals("D") && st.size()>=1){
                    st.push(st.peek()*2);
                }
                else if(operations[i].equals("C") && st.size()>=1)
                st.pop();
            }
            else
            return 0;
        }
        int score=0;
        while(!st.isEmpty()){
            score+=st.pop();
        }
        return score;
        
    }
}