package HashTable_II_08;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class sample {
    private static class Student {
        public int id;
        public String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object other) {
         /*   if (this == other) return true;
            if (!(other instanceof Student)) return false;*/
            Student student = (Student) other;
            return id == student.id && this.name.equals(((Student) other).name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, name);
        }
    }
    public static void main(String[] args) {
        Set<Student> mySet = new HashSet<>();
        Student s1 = new Student(123, "Jack");
        Student s2 = new Student(56, "Thong");
        Student s3 = new Student(123, "Jack");

        mySet.add(s1);
        mySet.add(s2);
        mySet.add(s3);

        for (Student student: mySet) {
            System.out.println(student);
        }
/*
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 == s3 " + (s1.equals(s3)));*/
    }
}
