//LeetCode 763. Partition Labels
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>al=new ArrayList<>();
        HashMap<Character,Integer>hm=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        hm.put(s.charAt(i),i);
        int maxl=0,start=0;
        for(int i=0;i<n;i++){
            maxl=Math.max(maxl,hm.get(s.charAt(i)));
            if(maxl==i){
                al.add(maxl-start+1);
                start=i+1;
            }
        }
        return al;
    }
}