package Sort;

public class InsertSort {
    public static void printInsertSort(int no, int[] a) {
        System.out.printf("%d: ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println(" ");
    }
    public static void Insert_Sort(int[] a)
    {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int ai = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > ai) {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = ai;
            printInsertSort(i, a);
        }
    }
    public static void main(String[] args) {
        int[] a = {5, 9, 6, 2, 1, 0, 3, 4 };
        Insert_Sort(a);
    }
}
