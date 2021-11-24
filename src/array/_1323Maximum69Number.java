package array;

public class _1323Maximum69Number {
    public static int maximum69Number (int num) {
        StringBuilder stringBuilder = new StringBuilder();
        String s = String.valueOf(num);
        int step = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '6' && step == 0){
                stringBuilder.append('9');
                step ++;
            }else {
                stringBuilder.append(s.charAt(i));
            }
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    // complexit time 0(n)
    // complexit space 0(n)

    public static void main(String[] args) {
        int  num = 9669;
        System.out.println(maximum69Number(num));
    }
}

