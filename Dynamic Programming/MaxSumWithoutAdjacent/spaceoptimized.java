//Max Sum without Adjacents(GFG)
//(space optimization)

class Solution {
    int findMaxSum(int arr[]) {
        // code here
        int pre=arr[0];
        int nxtpre=0;
        for(int i=1;i<arr.length;i++){
            int pick=arr[i];
            if(i>1)
            pick +=nxtpre;
            int notpick=0+pre;
            nxtpre=pre;
            pre=Math.max(pick,notpick);
        }
        return pre;
    }
   
}