package array;

public class _1051HeightChecker {
    // solution : copies arr -> new arr
    //  -> so sanh so phan tu bi thay doi trong 2 mang -> so hoc sinh bij thay doi cho
//    public static void printArr(int[] a){
//      //  System.out.printf("%d", no);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println("");
//    }

    public static int heightChecker(int[] heights) {
        int n = heights.length;
        int[] copiesArray = new int[n];
       // int index = 0;
        for (int i = 0; i < n; i++) {
           copiesArray[i] = heights[i];
           //index ++;
        }
       // printArr(copiesArray);
        // select sort

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                // tim phan tu nho nhat [i -> n]
                if (copiesArray[j] < copiesArray[min]){
                    min = j;
                }
            }
            // swap
            if (min != i){
                int temp = copiesArray[i];
                copiesArray[i] = copiesArray[min];
                copiesArray[min] = temp;
            }
        }
      //  printArr( copiesArray);
        // so sanh
        int coutn = 0;
        for (int i = 0; i < n; i++) {
           if(heights[i] != copiesArray[i]){
               coutn ++;
           }
        }
       return coutn;
    }


    public static void main(String[] args) {
       int[] heights = {2,1,2,1,1,2,2,1};
        System.out.println( heightChecker(heights));
    }
}
