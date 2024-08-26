// Method 2: Using Formula for the Sum of Nth Term
import java.util.Scanner;
public class Problem_003_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = (num * (num + 1)) / 2; // n * (n+1) / 2
        System.out.println(sum);
    }
}