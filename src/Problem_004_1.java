// Find the Sum of N Natural Numbers in Java
//  Method 1: Using for Loop
import java.util.Scanner;
public class Problem_004_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
