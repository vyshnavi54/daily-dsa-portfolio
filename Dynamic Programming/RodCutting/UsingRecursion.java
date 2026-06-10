//GFG Problem
//Using Recursion
class Solution {
    public int cutRod(int[] price) {
        // code here
        return maxvalue(price.length-1,price.length,price);
        
    }
    static int maxvalue(int i,int n,int[] price){
        if(i==0)
        return price[0]*n;
        int notpick=0+maxvalue(i-1,n,price);
        int pick=0;
        int rodlength=i+1;
        if(rodlength<=n)
        pick=price[i]+maxvalue(i,n-rodlength,price);
        return Math.max(pick,notpick);
    }
}