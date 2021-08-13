package array;

public class _88_Merge_Sorted_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            chenvaonums1(ai, nums1, m);
            m++;
        }
    }

    private static void chenvaonums1(int ai, int[] nums1, int m) {
        boolean timduoc = false;
        for (int k = 0; k < m; k++) {
            if (nums1[k] > ai) {
                timduoc = true;
                for (int i = m-1; i >= k; i --) {
                    nums1[i+1] = nums1[i];
                }
                nums1[k] = ai;
                break;
            }

        }

        if (timduoc == false) {
            nums1[m] = ai;
        }
    }

    // dung 2 con tro
    public static void merge2(int[] n1, int m, int[] n2, int n)  {

    }


    public static void main(String[] args) {
        int[] n1 = {1,2,3,4,0,0,0};
        int[] n2 = {2,5,6};
        merge(n1, 4, n2, 3);
        System.out.println("DONW");
    }
}
