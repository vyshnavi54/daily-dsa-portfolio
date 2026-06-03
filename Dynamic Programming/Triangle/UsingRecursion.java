//LeetCode 120.Triangle
//UsingRecursion
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        return minval(0,0,triangle);
        
    }
    static int minval(int i,int j,List<List<Integer>> t){
        if(i==t.size()-1)
        return t.get(i).get(j);
        if(i>=t.size())
        return 0;
        int down=t.get(i).get(j)+minval(i+1,j,t);
        int downadj=t.get(i).get(j)+minval(i+1,j+1,t);
        return Math.min(down,downadj);
    }
}