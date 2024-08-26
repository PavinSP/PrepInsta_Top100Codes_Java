// Method 3: Using Ternary Operator
import java.util.Scanner;
public class Problem_007_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int temp = num1 > num2 ? num1 : num2;
        int result = temp > num3 ? temp : num3;
        System.out.println(result + " is greater");
    }
}