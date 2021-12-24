package Exercise_basic;

import java.util.Scanner;

public class _02_phươngtrìnhbậcnhất {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b;
        float result = 0;
        a = sc.nextFloat();
        b = sc.nextFloat();
        if (a == 0 && b == a) {
            System.out.println("hương trình có vô số nghiệm!");
        }else if (a == 0 && b!= 0) {
            System.out.println(" Phương trình vô nghiệm!");
        }else {
            System.out.println("Result: " +   (result = -b / a));
        }
    }
}
