package Arrays;

public class _88_Merge_Sorted_Array {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int ai : nums2) {
            chenvaonums1(ai, nums1, m);
            m++;
        }
    }
    // 
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
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int k = (m+n) - 1;
        while(k >=0){
            if(i < 0) {
                nums1[k] = nums2[j];
                j--;
            }else if(j < 0) {
                nums1[k] = nums1[i];
                i--;
            }else if(nums1[i] >= nums2[j]){
                nums1[k] = nums1[i];
                i--;
            }else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }


    public static void main(String[] args) {
        int[] n1 = {0};
        int[] n2 = {1};
        merge2(n1, 0, n2, 1);
        System.out.println("DONW");
    }
}
