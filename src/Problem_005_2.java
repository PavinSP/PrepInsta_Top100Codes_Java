// Method 2: Using the Formula
import java.util.Scanner;
public class Problem_005_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = (num2 * (num2+1)) / 2 - (num1 * (num1+1)) / 2 + num1;
        System.out.println(result);
    }
}