// Method 2: Using Recursion
import java.util.Scanner;
public class Problem_015_2 {
    static int a = 0, b = 1, next;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(a + " " + b);
        fibonacci(num - 2);
    }
    public static void fibonacci(int num){
        if (num > 0){
            next = a + b;
            a = b;
            b = next;
            System.out.print(" " + next);
            fibonacci(num - 1);
        }
    }
}
