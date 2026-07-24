//Leetcode 406. Queue Reconstruction by Height
class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(b[0],a[0]);
        });
        ArrayList<int[]>al=new ArrayList<>();
        for(int i=0;i<people.length;i++){
            al.add(people[i][1],people[i]);
        }
        return al.toArray(new int[al.size()][]);
    }
}