//Method 4: Optimization by √n
import java.util.Scanner;
public class Problem_009_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean prime = true;
        if (num < 2) prime = false;
        else {
            for (int i = 2; i*i <= num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
        }
        if (prime) System.out.println("Prime");
        else System.out.println("Not a prime");
    }
}