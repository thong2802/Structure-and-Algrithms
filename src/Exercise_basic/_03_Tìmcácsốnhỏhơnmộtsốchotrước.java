package Exercise_basic;

import java.util.Scanner;

public class _03_Tìmcácsốnhỏhơnmộtsốchotrước {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Input n");
        n = sc.nextInt();
        if(n < 0){
            System.out.println("Vui long nhap n > 0");
        }else{
            System.out.println("So chan < n");
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0){
                    System.out.print(i + " ");
                }
            }
            System.out.println("\nSo le < n");
            for (int i = 0; i < n; i++) {
                if (i % 2 != 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
