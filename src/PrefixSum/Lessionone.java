package PrefixSum;

import java.util.Scanner;

// Ggiven sequence : day  cho truoc
public class Lessionone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int[] a = new int[1005];
        int[] f = new int[1005];

        // input a[i]
        System.out.println("=============");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        //
        System.out.println("=============");
        for (int i = 1; i <= n; i++) {
            f[i] = f[i - 1] + a[i];
        }
        // prefixSum [i] = f[i] + a[i]
        // prefixSum [i..j] = f[i] - f[i-1]
        System.out.println(f[8] - f[3-1]);
    }
}
