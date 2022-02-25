package Sort;

public class SelectSort {
    // run from head to the end array
    // at loop i : find element min from [i+1, n-1], if less more a[i], then swap a[i]
    // then loop i : [0,i] is sorted.

    public static void printSort(int no, int[] a) {
        System.out.printf("%d, ", no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d ", a[i]);
        }
        System.out.println(" ");
    }
    public static void selectSort(int[] a) {
        int n = a.length;
        int min;
        for (int i = 0; i < n -1; i++) {
            min = i;
            for (int j = i +1; j < n; j++) {
                if (a[j] < a[min]){
                    min = j;
                }
            }
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
            printSort(i, a);
        }
    }
    public static void main(String[] args) {
        int[] a = {5, 9, 6, 2, 1, 0, 3, 4 };
        selectSort(a);
    }
}
