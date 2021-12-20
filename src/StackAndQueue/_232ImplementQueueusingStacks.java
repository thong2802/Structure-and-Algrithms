package StackAndQueue;

import java.util.Stack;

public class _232ImplementQueueusingStacks {
    Stack<Integer> stact1 = new Stack<>();
    Stack<Integer> stact2 = new Stack<>();
    /** Initialize your data structure here. */
    public _232ImplementQueueusingStacks() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
      stact1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
     if (stact2.empty()){
         while (stact1.empty() == false){
             stact2.push(stact1.pop());
         }
       }
     return stact2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stact2.empty()){
            while (stact1.empty() == false){
                stact2.push(stact1.pop());
            }
        }
        return stact2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
       return stact1.empty() && stact2.empty();
    }


    public static void main(String[] args) {

    }
}
