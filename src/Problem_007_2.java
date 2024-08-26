// Method 2: Using if-else Statements - 1
import java.util.Scanner;
public class Problem_007_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) System.out.println(num1 + " is greater");
        else if (num2 > num1 && num2 > num3) System.out.println(num2 + " is greater");
        else System.out.println(num3 + " is greater");
    }
}