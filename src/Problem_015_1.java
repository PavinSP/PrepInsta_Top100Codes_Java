// Find the Fibonacci Series up to Nth Term in Java Language
// Method 1: Using Iteration
import java.util.Scanner;
public class Problem_015_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        fibonacci(num);
    }
    public static void fibonacci(int num){
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        while (num - 2 > 0){
            int sum = a + b;
            System.out.print(" " + sum);
            a = b;
            b = sum;
            num--;
        }
    }
}
