// Method 3: Using Ternary Operator
import java.util.Scanner;
public class Problem_008_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.println((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0) ? "Leap year" : "Not a leap year");
    }
}