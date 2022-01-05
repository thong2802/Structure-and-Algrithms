package Exercise_basic;

public class _05_Tổngcấpsốcộngđảo {
    public static float sum(int n){
        float result = 0;
        for (int i = 1; i <= n; i++) {
            result += 1*1.0f / i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(2));
    }
}
