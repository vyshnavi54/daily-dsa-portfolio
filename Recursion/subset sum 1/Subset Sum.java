#Subset Sum Problem(GFG) (using recursion)

class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        return subset(arr,sum,0,0);
    }
    static Boolean subset(int arr[],int sum,int index,int s){
        if(sum==s){
            return true;
        }
        if(index>=arr.length)
        return false;
        boolean pick=subset(arr,sum,index+1,s+arr[index]);
        boolean notpick=subset(arr,sum,index+1,s);
        return pick||notpick;
        
    }
}