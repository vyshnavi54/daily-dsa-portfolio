#Fractional Knapsack

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        ArrayList<Items>al=new ArrayList<>();
        for(int i=0;i<val.length;i++){
            al.add(new Items(val[i],wt[i]));
        }
        al.sort((a,b)-> Double.compare((double)b.va/b.w,(double)a.va/a.w));
        double v=0.0;int c=capacity;
        for(Items i:al){
            if(c==0)
            break;
            else if(i.w<=c){
                v=v+i.va;
                c=c-i.w;
            }
            else{
                v=v+(double)i.va*c/i.w;
                c=0;
                
            }
            
        }
        return v;
    }
}
class Items{
    int va,w;
    public Items(int va,int w){
        this.va=va;
        this.w=w;
    }
}