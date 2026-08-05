//LeetCode 621. Task Scheduler
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        for(int i=0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->b-a);
        for(int f:freq){
            if(f>0)
            pq.add(f);
        }
        Queue<int[]>q=new LinkedList<>();
        int time=0,a=0;
        while(!q.isEmpty()||!pq.isEmpty()){
            if(!q.isEmpty() && q.peek()[1]==time){
                int[] arr=q.remove();
                pq.add(arr[0]);
            }
            if(!pq.isEmpty())
            a=pq.poll();
            a--;
            if(a>0)
            q.add(new int[] {a,time+n+1});
            time++;
        }
        return time;
        
    }
}