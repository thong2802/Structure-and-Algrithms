package array_01;

public class __1450NumberofStudentsDoingHomeworkataGivenTime {
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] &&  queryTime <= endTime[i]) {
                count ++;
            }
        }
        return count > 0? count:0;
    }

    // complixity time : O(n)
    // complixity space : O(1)

    public static void main(String[] args) {
         int[] startTime = {1,2,3};
         int[] endTime = {3,2,4};
        System.out.println(busyStudent(startTime, endTime, 4));
    }
}
