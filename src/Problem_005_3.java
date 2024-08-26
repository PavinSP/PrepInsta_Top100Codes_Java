// Method 3: Using Recursion
import java.util.Scanner;
public class Problem_005_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println(sum(num1, num2));
    }
    public static int sum(int num1, int num2){
        int sum = 0;
        if (num1 > num2)
            return sum;
        return num1 + sum(num1+1, num2);
    }
}