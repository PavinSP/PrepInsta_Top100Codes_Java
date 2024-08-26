// Method 2: Optimization by break condition
import java.util.Scanner;
public class Problem_009_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean prime = true;
        if (num < 2){
            System.out.println("Not a prime");
            System.exit(0);
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        if (prime) System.out.println("Prime");
        else System.out.println("Not a prime");
    }
}