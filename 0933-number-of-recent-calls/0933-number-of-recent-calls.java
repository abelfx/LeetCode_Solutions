class RecentCounter {

    Queue<Integer> queue;
    public RecentCounter() {
        queue = new LinkedList<Integer>();
       
    }
    
    public int ping(int t) {
        queue.add(t);
        
        while(queue.peek() < t - 3000) {
            queue.poll();
        }
        while(queue.peek() > t){
queue.poll();}
        
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */