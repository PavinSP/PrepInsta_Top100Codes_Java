// Method 2: Using For loop
import java.util.Scanner;
public class Problem_011_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rev = 0;
        for (; num > 0; num /= 10){
            rev = rev * 10 + num % 10;
        }
        System.out.println(rev);
    }
}