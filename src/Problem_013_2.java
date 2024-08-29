// Method 2: Using Recursion
import java.util.Scanner;
public class Problem_013_2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int length = length(num);
        System.out.println(armstrong(num, length) == num ? "Armstrong" : "Not armstrong");
    }
    public static int length(int num){
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static int armstrong(int num, int length){
        if (num == 0){
            return 0;
        }
        int sum = 0;
        int last = num % 10;
        sum += (int) Math.pow(last, length) + armstrong(num / 10, length);
        return sum;
    }
}