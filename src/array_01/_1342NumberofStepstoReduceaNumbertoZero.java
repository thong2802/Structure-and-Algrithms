package array_01;

public class _1342NumberofStepstoReduceaNumbertoZero {
    // use recursion
    public  static int numberOfSteps(int num) {
        return help(num,0);
    }
    public static int help(int num,int c){
        if(num==0){
            return c;
        }
        if(num%2==0){
            return help(num/2,c+1);
        }
        return help(num-1,c+1);
    }

    // use loop
    public static int numberOfSteps1(int num) {
        int step = 0;
        while (num > 0){
            if (num % 2 == 0){
                num = num / 2;
            }else {
                num  = num - 1;
            }
            step ++;
        }
        return step;
    }
    // complexity  time 0(logN)
    // complexity space 0(1)
    public static void main(String[] args) {
        System.out.println(numberOfSteps1(8));
    }
}
