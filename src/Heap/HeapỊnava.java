package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapỊnava {

   public static class Student implements Comparable{
        public int age;
        public String name;

       public Student(int age, String name) {
           this.age = age;
           this.name = name;
       }

       @Override
       public int compareTo(Object o) {
           Student other = (Student)o;
           return Integer.compare(this.age, other.age);
       }
   }
    public static void main(String[] args) {
       Queue<Student> minHeap = new PriorityQueue<>(Comparator.reverseOrder());
        minHeap.add(new Student(50, "A"));
        minHeap.add(new Student(15, "B"));
        minHeap.add(new Student(20, "C"));
        minHeap.add(new Student(30, "D"));

        while (minHeap.isEmpty() == false){
            Student younggestStudent = minHeap.poll();
            System.out.println(younggestStudent.age + " - " + younggestStudent.name);
        }


//        Queue<Integer> minHeap = new PriorityQueue<>();
//        minHeap.add(1);
//        minHeap.add(5);
//        minHeap.add(10);
//        minHeap.add(15);
//        minHeap.add(0);
//
//        while (minHeap.isEmpty() == false){
//            System.out.print(minHeap.poll() + " ");
//        }
//
//        System.out.println();
//        Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
//        maxHeap.add(1);
//        maxHeap.add(3);
//        maxHeap.add(5);
//        maxHeap.add(10);
//        maxHeap.add(100);
//        while (maxHeap.isEmpty() == false){
//            System.out.print(maxHeap.poll() + " ");
//        }
    }
}
