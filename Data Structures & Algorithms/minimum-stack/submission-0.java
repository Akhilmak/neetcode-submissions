class MinStack {

Stack<Integer> st;
PriorityQueue<Integer> pq;
    public MinStack() {
        this.st=new Stack<>();
        this.pq=new PriorityQueue();
    }
    
    public void push(int val) {
        st.push(val);
        pq.offer(val);
    }
    
    public void pop() {
        int rem=st.pop();
        pq.remove(rem);
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return pq.peek();
    }
}
