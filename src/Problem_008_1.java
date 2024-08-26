// Check whether the Year is a Leap Year in Java
/*
A year is a leap year if any one of the following conditions are satisfied:
The year is multiple of 400.
The year is a multiple of 4 and not a multiple of 100.
 */
// Method 1: Using if-else Statements - 1
import java.util.Scanner;
public class Problem_008_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if (year % 400 == 0) System.out.println("Leap year");
        else if (year % 4 == 0 && year % 100 != 0) System.out.println("Leap year");
        else System.out.println("Not a leap year");
    }
}