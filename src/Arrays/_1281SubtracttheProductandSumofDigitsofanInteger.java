package Arrays;

public class _1281SubtracttheProductandSumofDigitsofanInteger {
    public static  int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n!=0){
            sum += n % 10;
            product *= n % 10;

            n = n / 10;
        }
        return product - sum;
    }
// complexity time 0(n)
// complexity space 0(1)

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
}
