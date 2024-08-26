// Check whether the Number is a Palindrome in Java Language
// Method 1: Using Iteration
import java.util.Scanner;
public class Problem_012_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int original = num;
        int rev = 0;
        while (num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        if (original == rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}