//LeetCode 295. Find Median from Data Stream
class MedianFinder {
    PriorityQueue<Integer>lefthalf=new PriorityQueue<>((a,b)->b-a);
    PriorityQueue<Integer>righthalf=new PriorityQueue<>((a,b)->a-b);
    public MedianFinder() {
    }
    
    public void addNum(int num) {
        if(lefthalf.isEmpty()||lefthalf.peek()>=num)
        lefthalf.add(num);
        else 
        righthalf.add(num);
        if(lefthalf.size()>righthalf.size()+1)
        righthalf.add(lefthalf.poll());
        else if(righthalf.size()>lefthalf.size()+1)
        lefthalf.add(righthalf.poll());
    }
    
    public double findMedian(){
        
        if(righthalf.size()==lefthalf.size())
        return (righthalf.peek()+lefthalf.peek())/2.0;
        if(righthalf.size()>lefthalf.size())
        return righthalf.peek();
        return lefthalf.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */