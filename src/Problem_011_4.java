// Method 4: Using Recursion II
import java.util.Scanner;
public class Problem_011_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        rev(num);
    }
    public static void rev(int num){
        if (num == 0){
            return;
        }
        int last = num % 10;
        System.out.print(last);
        rev(num / 10);
    }
}
