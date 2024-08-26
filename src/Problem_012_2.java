// Method 2: Using Recursion
import java.util.Scanner;
public class Problem_012_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rev = 0;
        System.out.println(num == rev(num, rev) ? "Palindrome" : "Not a palindrome");
    }
    public static int rev(int num, int rev){
        if (num == 0) return rev;
        rev = rev * 10 + num % 10;
        return rev(num / 10, rev);
    }
}