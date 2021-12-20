package String_03;

public class _1374_GenerateaStringWithCharactersThatHaveOddCounts {
    // if N is number odd => cac ki tu giong giong deu le
    // if N is number even => cac ki tu giong nhau = n - 1 + ki tu ngau nhien
    public static String generateTheString(int n) {
        char[] result = new char[n];
        int i = 0;
        while (i < n - 1) {
            result[i] = 'a';
            i++;
        }
        if (n % 2 != 0) {
            result[i] = 'a';
        }else {
            result[i] = 'b';
        }
        return new String(result);
    }
    // complexity time 0(N)
    // complexity space 0(N)
    public static void main(String[] args) {
        System.out.println(generateTheString(2));
    }
}
