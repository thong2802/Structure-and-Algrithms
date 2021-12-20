package array_01;

public class _27RemoveElement {
    public static int removeElement(int[] a, int val) {
        int n = a.length;
        for (int i = 0; i < n;) {
            if (a[i] == val) {
                // xoa phan tu
                for (int j = i; j <= (n-2); j++) {
                    a[j] = a[j+1];
                }
                n--;
            }else { // khong phai xoa
                i++;
            }
        }
      return n;
    }

    public static int removeElement2(int[] a, int val) {
        int k = 0;
        int n = a.length;
        for (int i = 0; i < n; i++) {
            if (a[i] != val) {
                a[k] = a[i];
                k++;
            }

        }
        return k;
    }


    public static void main(String[] args) {
        int[] a = {3,2,2,3};
      //  System.out.println(removeElement(a, 2));
        System.out.println(removeElement2(a, 2));
        System.out.println("done");
    }
}
