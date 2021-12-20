package Sort;

public class Sort {
    public static void PrintArr (int no, int[] a) {
        System.out.printf("%d: " , no);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d " , a[i]);
        }
        System.out.println(" ");
    }
    // Bubble sort , 0(n^2)
    public static void BubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < (n - i -1); j++) { // vi j j + 1 < n - i = >j < n-i-1
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int t = a[j];
                    a[j] = a[j +1] ;
                    a[j +1] = t;
                }
            }
            PrintArr(i, a);
            if (isSorted) {
                break;
            }
        }
    }
    // Select sort 0(n^2)
    public static  void SelectSort(int[] a) {
        int min ;
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            min = i;
            for (int j = i +1; j < n; j++) {
                // tim phan tu nho nhat [i -> n]
                 if (a[j] < a[min]) {
                     min = j;
                 }
            }
            // swap
            if (min != i){
                int t = a[i];
                a[i] = a[min];
                a[min] = t;
            }
            PrintArr(i, a);

        }
    }
    //Insert sort 0(n^2)
    public static  void InsertSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            // chen a[i] vao day [0, i-1]
            int ai = a[i];
            int j = i - 1;
            while ( j >= 0 && a[j] > ai){
               a[j + 1] = a[j];
               j--;
            }
            a[j + 1] = ai;
            PrintArr(i, a);
        }
    }

    public static  void Insert(int[] a){
        int n = a.length;
        for (int i = 1; i <  n; i++) {
            // chen a[i] vao [0, i-1]
            int ai = a[i];
            int j = i-1;
            while (j >= 0 && a[j] > ai){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
            PrintArr(i, a);
        }
    }
    public static void main(String[] args) {
        //int[] a = {5, 9, 6, 2, 1, 0, 3, 4 };
        //BubbleSort(a);
        //SelectSort(a);
        //InsertSort(a);
        //Insert(a);
    }
}
