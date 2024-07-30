// https://leetcode.com/problems/implement-queue-using-stacks/description/

class MyQueue {
    Stack<Integer> st1 = new Stack<>();
    Stack<Integer> st2 = new Stack<>();
    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        st1.push(x);
    }
    
    public int pop() {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int poped = st2.pop();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return poped;
    }
    
    public int peek() {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        int peeked = st2.peek();
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return peeked;
    }
    
    public boolean empty() {
        if(st1.isEmpty() && st2.isEmpty()){
            return true;
        }
        return false;
    }
}

