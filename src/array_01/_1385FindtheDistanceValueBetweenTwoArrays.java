package array_01;

public class _1385FindtheDistanceValueBetweenTwoArrays {

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=arr1.length;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                int diff=Math.abs(arr1[i]-arr2[j]);
                if(diff<=d ){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {4,5,9,8,8,8};
        int[] arr2 = {10,9,1,8};
        System.out.println(findTheDistanceValue(arr1, arr2, 2));
    }

}
