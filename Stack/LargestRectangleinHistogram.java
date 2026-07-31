//84. Largest Rectangle in Histogram
class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer>st=new Stack<>();
        int n=heights.length;
        int[] ans1=new int[n];
        int[] ans2=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())
            ans1[i]=-1;
            else
            ans1[i]=st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty()&& heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty())
            ans2[i]=n;
            else
            ans2[i]=st.peek();
            st.push(i);
        }
        int area=-1,width=0;
        for(int i=0;i<n;i++){
            width=ans2[i]-ans1[i]-1;
            area=Math.max(heights[i]*width,area);
        }
        return area;
        
    }
}