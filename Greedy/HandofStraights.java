//Leetcode 846. Hand of Straights
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        int n=hand.length;
        if(n%groupSize!=0)return false;
        Arrays.sort(hand);
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(hand[i],hm.getOrDefault(hand[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(hm.containsKey(hand[i])){
                hm.put(hand[i],hm.get(hand[i])-1);
                if(hm.get(hand[i])==0)
                hm.remove(hand[i]);
                int ans=1;
                while(ans<groupSize){
                    if(!hm.containsKey(hand[i]+ans) || hm.get(hand[i]+ans)<=0)
                    return false;
                    hm.put(hand[i]+ans,hm.get(hand[i]+ans)-1);
                    if(hm.get(hand[i]+ans)==0)
                    hm.remove(hand[i]+ans);
                    ans++;
                }
            }
        }
        return true;
    }
}