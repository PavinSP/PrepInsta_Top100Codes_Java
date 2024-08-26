// Method 3: Using Recursion I
import java.util.Scanner;
public class Problem_011_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(reverse(num, 0));
    }
    public static int reverse(int num, int rev){
        if (num == 0){
            return rev;
        }
        rev = rev * 10 + num % 10;
        return reverse(num / 10, rev);
    }
}