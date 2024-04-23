class MyStack {
    private Queue<Integer>  queue1;
    private Queue<Integer>  queue2;
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        if(queue1.isEmpty()){
            queue1.offer(x);
            while(!queue2.isEmpty()){
                queue1.offer(queue2.poll());
            }
        }else{
            queue2.offer(x);
            while(!queue1.isEmpty()){
                queue2.offer(queue1.poll());
            }
        }
            
    }
    
    public int pop() {
        if(!queue1.isEmpty()){
            return queue1.poll();
        }else{
            return queue2.poll();
        }
    }
    
    public int top() {
        return queue1.isEmpty() ? queue2.peek() : queue1.peek();
    }
    
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
