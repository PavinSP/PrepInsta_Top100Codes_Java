// Method 2: Using if-else Statements - 2
import java.util.Scanner;
public class Problem_008_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) System.out.println("Leap year");
        else System.out.println("Not a leap year");
    }
}
