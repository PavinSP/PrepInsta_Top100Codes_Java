// Find the Reverse of a Number in Java Language
// Method 1: Using while loop
import java.util.Scanner;
public class Problem_011_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rev = 0;
        while (num > 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(rev);
    }
}
