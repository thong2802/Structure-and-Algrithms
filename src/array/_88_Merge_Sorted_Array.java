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
    public  void merge2(int[] n1, int m, int[] n2, int n) {
        int i = m - 1;
        int j = n -1;
        int k = ( m + n) - 1;
        while(k >= 0) {
            if(i < 0) {
                n1[k] = n2[j];
                j--;
            }else if(j < 0) {
                n1[k] = n1[i];
                i--;
            }else if(n1[i] >= n2[j]) {
                n1[k] = n1[i];
                i--;
            }else {
                n1[k] = n2[j];
                j--;
            }
            k--;
        }
    }


    public static void main(String[] args) {
        int[] n1 = {0};
        int[] n2 = {1};
        merge(n1, 0, n2, 1);
        System.out.println("DONW");
    }
}
