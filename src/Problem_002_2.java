// Method 2: Using Ternary Operator
import java.util.Scanner;
public class Problem_002_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(Math.abs(num) % 2 == 1 ? "Odd" : "Even");
    }
}