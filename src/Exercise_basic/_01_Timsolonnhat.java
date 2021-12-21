package Exercise_basic;

import java.util.Scanner;

public class _01_Timsolonnhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.println("input a");
        a = sc.nextInt();
        System.out.println("input b");
        b = sc.nextInt();
        System.out.println("input c");
        c = sc.nextInt();
        System.out.println("input d");
        d = sc.nextInt();
        System.out.println("input e");
        e = sc.nextInt();
        System.out.println("input f");
        f = sc.nextInt();
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max){
            max = c;
        }
        if(d > max){
            max = d;
        }
        if (e > max) {
            max = e;
        }
        if (f > max) {
            max = f;
        }
        if (a == b && b == c && c == d && d == e && e == f){
            System.out.println("dont have max");
        }
        System.out.println(max);
        return;
    }
}
