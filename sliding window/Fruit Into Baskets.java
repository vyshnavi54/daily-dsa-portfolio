#904. Fruit Into Baskets
class Solution {
    public int totalFruit(int[] fruits) {
        int l=0,r=0,n=fruits.length,maxl=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(r<n){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
            if(hm.size()<=2){
                maxl=Math.max(maxl,r-l+1);
            }
            else{
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0)
                hm.remove(fruits[l]);
                l++;
            }
            r++;
        }
        return maxl;
    }
}