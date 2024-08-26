// Method 2: Using Formula
import java.util.Scanner;
public class Problem_004_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = (num * (num+1)) / 2;
        System.out.println(sum);
    }
}