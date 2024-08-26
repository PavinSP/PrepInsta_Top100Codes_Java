// Find the Greatest of the Two Numbers in Java
// Method 1: Using if-else Statements
import java.util.Scanner;
public class Problem_006_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2) System.out.println(num1 + " is greater");
        else if (num1 < num2) System.out.println(num2 + " is greater");
        else System.out.println("Both are equal");
    }
}