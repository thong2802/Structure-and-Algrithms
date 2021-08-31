package StackAndQueue;

import java.util.Stack;

public class StackinJava {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();

        for (Integer stacks : stack) {
            System.out.println(stacks);
        }
    }
}
