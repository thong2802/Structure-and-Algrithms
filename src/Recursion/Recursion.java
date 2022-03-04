package Recursion;

public class Recursion {
    public static void printF(){
        System.out.println("F");
        printF();
    }
    public static void main(String[] args) {
        printF();
    }
}
