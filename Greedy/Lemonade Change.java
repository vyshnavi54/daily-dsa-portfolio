LeetCode 860. Lemonade Change
class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]!=5||bills[1]==20||bills[2]==20)
        return false;
        int f=1,c=0,t=0;
        for(int i=1;i<bills.length;i++){
            if(bills[i]==10){
                if(f!=0)
                {
                    f--;
                    c++;
                }
                else
                return false;
            }
            else if(bills[i]==5)
            f++;
            else{
                if(f!=0 && c!=0){
                    f--;;
                    c--;
                }
                else if(f>=3)
                f=f-3;
                else
                return false;
            }
        }
        return true;
        
    }
}