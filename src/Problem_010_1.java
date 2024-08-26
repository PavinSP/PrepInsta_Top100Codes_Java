// Find all the Prime Numbers in a Given Interval in Java
// Method 1: Using inner loop Range as [2, number-1].
import java.util.Scanner;
public class Problem_010_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        for (int i = num1; i <= num2; i++){
            if (prime(i)) System.out.print(i + " ");
        }
    }
    public static boolean prime(int num){
        if (num < 2) return false;
        for (int i = 2; i < num; i++){
            if (num % i == 0)
                return false;
        }
        return true;
    }
}