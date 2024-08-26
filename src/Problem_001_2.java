// Method 2: Using Nested if-else Statements
import java.util.Scanner;
public class Problem_001_2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 0){
            if (num == 0) System.out.println("Zero");
            else System.out.println("Positive");
        }
        else System.out.println("Negative");
    }
}
