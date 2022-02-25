package Sort;

public class Bubble_Sort {
    // run from head to the end array
    // If element the first than more the second element is swap
    // then each loop is the max element will downd the end array.

    public static void printSort(int no, int[] a) {
        System.out.printf("%d: " , no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d " , a[i]);
        }
        System.out.println(" ");
    }
    public static void BubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean sorted = true;
            for (int j = 0; j < (n - i- 1); j++) {
                if (a[j] > a[j+1]){
                    sorted = false;
                    // swap
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
            printSort(i, a);
            if (sorted) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {5, 9, 6, 2, 1, 0, 3, 4 };
        BubbleSort(a);
    }
}
