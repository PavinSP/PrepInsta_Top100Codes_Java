// Method 3: Using Bitwise Operator
import java.util.Scanner;
public class Problem_002_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int bit_wise = num & 1;
        if (bit_wise == 1) System.out.println("Odd");
        else System.out.println("Even");
    }
}