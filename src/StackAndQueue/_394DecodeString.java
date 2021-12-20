package StackAndQueue;

import java.util.Stack;

public class _394DecodeString {
    public static String decodeString(String s) {
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
          char c = s.charAt(i);
          if (c == ']'){
              // thuc hien xu li

              // Pop unit meet '['
              String loopString = "";
              while (stack.peek() != '['){
                  loopString = stack.pop() + loopString;
              }
              // remove '['
              stack.pop();
              // get number
              String numberString = "";
              while (stack.empty() == false && Character.isDigit(stack.peek())){
                numberString = stack.pop() + numberString;
              }
              //chuyen so thanh int
              int nLoop = Integer.parseInt(numberString);

              // nhan so ki tu len
              loopString = loopString.repeat(nLoop);

              // add rusult back to stack
              for (int j = 0; j < loopString.length(); j++) {
                  stack.push(loopString.charAt(j));
              }


          }else {
              stack.push(c);
          }
        }


        // get tat ca phan tu da giai ma
        String result = "";
        while (stack.isEmpty() == false){
            result = stack.pop() + result;
        }
        return result;
    }

    public static void main(String[] args) {
        String s ="2[abc]3[cd]ef";
        System.out.println( decodeString(s));
    }
}
