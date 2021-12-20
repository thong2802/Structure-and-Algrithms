package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class _225ImplementStackusingQueues {
    public _225ImplementStackusingQueues() {

    }
   Queue<Integer> queu1 = new LinkedList<>();
   Queue<Integer> queu2 = new LinkedList<>();
    /** Push element x onto stack. */
    public void push(int x) {
      queu1.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        // chuyen queu1 -> queu2
        // cho các phần từ chuyển qua queue 2 và để lại phần tử cuối cùng ở quueu 1 để remove.
        // sau khi remove thì chuyển queu2 thành main chính là queue1.
        int value = -1;
         while (queu1.isEmpty() == false){
             if (queu1.size() == 1){
             value = queu1.remove();
             }else {
                 queu2.add(queu1.remove());
             }
         }

         // đổi queu2 => queu1.
         Queue<Integer> temp = new LinkedList<>();
         temp = queu1;
         queu1 = queu2;
         queu2 = temp;
     return value;
    }

    /** Get the top element. */
    public int top() {
        int value = -1;
        while (queu1.isEmpty() == false){
            if (queu1.size() == 1){
              value = queu1.remove();
              queu2.add(value);
              // vì lấy top lên dữ liệu k bị xoá đi nên cần update phần tử này vào queu2 để giũ nguyên số phần tử.
            }else {
                queu2.add(queu1.remove());
            }
        }

        // đổi queu2 => queu1.
        Queue<Integer> temp = new LinkedList<>();
        temp = queu1;
        queu1 = queu2;
        queu2 = temp;
       return value;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
       return queu1.isEmpty();
    }
}
