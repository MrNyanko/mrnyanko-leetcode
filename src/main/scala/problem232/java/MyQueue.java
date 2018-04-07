package problem232.java;

import java.util.Stack;

class MyQueue {

    Stack<Integer> inputStack = new Stack<>();
    Stack<Integer> outputStack = new Stack<>();

    /**
     * Initialize your data structure here.
     */
    public MyQueue() {

    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        inputStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        peek();
        return outputStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
