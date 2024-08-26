// Method 2: Using Ternary Operator
import java.util.Scanner;
public class Problem_006_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 == num2) System.out.println("Both are equal");
        else System.out.println(num1 > num2 ? num1 + " is greater" : num2 + " is greater");
    }
}