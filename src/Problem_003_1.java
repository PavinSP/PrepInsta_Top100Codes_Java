// Find the Sum of First N Natural Numbers in Java
// Method 1: Using for loop
import java.util.Scanner;
public class Problem_003_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) sum += i;
        System.out.println(sum);
    }
}