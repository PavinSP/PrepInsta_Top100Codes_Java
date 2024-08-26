// Method 3: Using Recursion
import java.util.Scanner;
public class Problem_004_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int num){
        if (num == 0) return 0;
        return num + sum(num - 1);
    }
}