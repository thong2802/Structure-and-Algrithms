package StackAndQueue;

import java.util.Stack;

public class _155MinStack {
    class Node{
        int value;
        int Min;
        Node(int value){
            this.value = value;
        }
    }
    Stack<Node> stack = new Stack<>();
    /** initialize your data structure here. */
    public _155MinStack() {

    }

    public void push(int val) {
     Node newNode = new Node(val);
     newNode.Min = stack.isEmpty() ? val : Math.min(val, stack.peek().Min);
//     if (stack.isEmpty()){
//         newNode.Min = newNode.value;
//     }else {
//         newNode.Min = Math.min(newNode.value, stack.peek().Min);
//     }
     stack.add(newNode);
    }

    public void pop() {
      stack.pop();
    }

    public int top() {
       return stack.peek().value;
    }

    public int getMin() {
       return stack.peek().Min;
    }
}
