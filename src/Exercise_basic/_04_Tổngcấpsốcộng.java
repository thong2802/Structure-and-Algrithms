package Exercise_basic;

public class _04_Tổngcấpsốcộng {
    public static int sum1(int n){
        int result = 0;
        result = (n*(n+1)) / 2;
        return result;
    }
    public static int sum2(int n){
        int result = 0;
        for (int i = 1; i <= n; i++)
        {

            result += i;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum2(3));
    }
}

