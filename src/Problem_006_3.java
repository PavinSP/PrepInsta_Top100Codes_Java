// Method 3: Using inbuilt max Function
import java.util.Scanner;
public class Problem_006_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 == num2) System.out.println("Both are equal");
        else System.out.println(Math.max(num1, num2) + " is greater");
    }
}