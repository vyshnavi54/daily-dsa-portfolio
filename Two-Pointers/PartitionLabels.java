//LeetCode 763. Partition Labels
class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> al=new ArrayList<>();
        HashMap<Character,Integer>hm=new HashMap<>();
        int n=s.length(),j=0;
        for(int k=0;k<n;k++){
            hm.put(s.charAt(k),k);
        }
        int start=0;
        for(int i=0;i<n;i++){
            j=Math.max(j,hm.get(s.charAt(i)));
            if(i==j){
                al.add(j-start+1);
                j++;
                start=i+1;
            }
        }
        return al;
    }
}