package Arrays;

import java.util.Arrays;

public class  _66PlusOne {
    public static int[] plusOne(int[] a) {
     int n = a.length;
     int soDu = 1; // tuy vao de bai ma so du thay doi
        // duy mang tu phai qua trai
     int i = n-1;
     while (i >= 0 && soDu > 0){
         int temp = a[i] + soDu; // vd 9 + 4 = 13 => lay phan du = 13 % 10 = 3 && so nguyen = 13/10 = 1
         a[i] = temp % 10;
         soDu = temp / 10;
         i--;
     }
     if (soDu == 0){
         return a;
     }
     int[] b = new int[n+1];
     b[0] = soDu;
        for (i = 0; i < n; i++) {
            b[i+1] = a[i];
        }
      return b;
    }
    public static void main(String[] args) {
       int[] a = {9,9,9};
       int[] b = plusOne(a);
        System.out.println(Arrays.toString(b));
    }

}
