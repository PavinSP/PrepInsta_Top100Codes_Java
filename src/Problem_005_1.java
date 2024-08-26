// Find the Sum of the Numbers in a Given Interval in Java
// Method 1: Using Brute Force
import java.util.Scanner;
public class Problem_005_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = 0;
        for (int i = num1; i <= num2; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}