//N meetings in one room(GFG)
class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        ArrayList<Meeting>al=new ArrayList<>();
        for(int i=0;i<start.length;i++){
            al.add(new Meeting(start[i],end[i]));
        }
        al.sort((a,b)->a.e-b.e);
        int c=1;int k=al.get(0).e;
        for(int i=1;i<al.size();i++){
            if(al.get(i).s>k){
                c++;
                k=al.get(i).e;
            }
        }
        return c;
    }
    
}
class Meeting{
    int s;int e;
    Meeting(int s,int e){
        this.s=s;
        this.e=e;
    }
    
}
