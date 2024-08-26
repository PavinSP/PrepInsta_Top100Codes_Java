// Method 6: Basic Recursion technique
import java.util.Scanner;
public class Problem_009_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (prime(num, 2)) System.out.println("Prime");
        else System.out.println("Not a prime");
    }
    public static boolean prime(int num, int i){
        if (num <= 1) return false;
        if (i == num) return true;
        if (num % i == 0) return false;
        i+=1;
        return prime(num, i);
    }
}