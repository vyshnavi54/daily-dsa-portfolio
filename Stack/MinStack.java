//LeetCode 155. Min Stack
class MinStack {
    Stack<Integer>st;
    Stack<Integer>minst=new Stack<>();
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int value) {
       if(minst.isEmpty())
       minst.push(value);
       else{
        minst.push(Math.min(value,minst.peek()));
       }
      
       st.push(value);
    }
    
    public void pop() {
        minst.pop();
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */