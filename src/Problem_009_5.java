// Method 5: Optimization by skipping even iteration
import java.util.Scanner;
public class Problem_009_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean prime = true;
        if (num < 2) prime = false;
        else if (num == 2) prime = true;
        else if (num % 2 == 0) prime = false;
        else{
            for (int i = 3; i*i <= num; i += 2){
                if (num % i == 0){
                    prime = false;
                    break;
                }
            }
        }
        System.out.println(prime ? "Prime" : "Not a prime");
    }
}