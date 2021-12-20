package Arrays;
import java.util.Scanner;
public class Demo {
    public static boolean checkNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap X");
        int X = scanner.nextInt();
        System.out.println("Nhap Y");
        int Y= scanner.nextInt();
        System.out.println("Nhap Z");
        int Z = scanner.nextInt();

        if (X < Y && Y < Z) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
       boolean Kq =  checkNumber();
        System.out.println(Kq);
    }
}
