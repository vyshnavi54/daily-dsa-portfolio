//LeetCode 451. Sort Characters By Frequency
class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>>pq=new PriorityQueue<>(
            (a,b)->b.getValue()-a.getValue()
        );
        for(Map.Entry<Character,Integer> map:hm.entrySet()){
            pq.add(map);
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> entry = pq.poll();
            for(int i=0;i<entry.getValue();i++){
                sb.append(entry.getKey());
            }

        }
        return sb.toString();
    }
}