package StackAndQueue;

import java.util.Stack;

public class _20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c =='{'){
                myStack.push(c);
            }else {
                if (myStack.empty() == true){
                    return false;
                }
                char openCheek = myStack.peek();
                if ((c == ')' && openCheek == '('
                    || c == '}' && openCheek == '{'
                    || c == ']' && openCheek == '[')){
                    myStack.pop();
                }else {
                    return false;
                }
            }
        }
        return myStack.empty() ? true : false;
    }


    public static void main(String[] args) {

    }
}
