// Check if a Number is Positive or Negative in Java
// Method 1: Brute Force
import java.util.Scanner;
public class Problem_001_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0) System.out.println("Positive");
        else if (num < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}
