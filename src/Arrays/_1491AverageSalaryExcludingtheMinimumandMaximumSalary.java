package Arrays;

import java.util.Arrays;

public class _1491AverageSalaryExcludingtheMinimumandMaximumSalary {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        int min = salary[0];
        int max = salary[0];
        int sum = 0;
        for (int i = 0; i <  salary.length; i++) {
            sum += salary[i];
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
        }
        sum = sum - max - min;
        return (double)sum / (salary.length - 2);
    }
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        average(salary);
    }
}
