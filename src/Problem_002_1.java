// Check Whether a Number is Even or Odd in Java
// Method 1: Brute Force
import java.util.Scanner;
public class Problem_002_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (Math.abs(num) % 2 == 1) System.out.println("Odd");
        else System.out.println("Even");
    }
}
