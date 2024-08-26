// Method 3: Using Ternary Operator
import java.util.Scanner;
public class Problem_001_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) System.out.println("Zero");
        else {
            String result = (num > 0) ? "Positive" : "Negative";
            System.out.println(result);
        }
    }
}