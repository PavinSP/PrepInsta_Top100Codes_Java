// Method 4: Using inner loop Range as [3, sqrt(number), 2]
import java.util.Scanner;
public class Problem_010_4 {
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
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2){
            if (num % i == 0)
                return false;
        }
        return true;
    }
}