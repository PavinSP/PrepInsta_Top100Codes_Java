// Check whether the Number is an Armstrong Number
// Method 1: Using Iteration
import java.util.Scanner;
public class Problem_013_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(armstrong(num) ? "Armstrong number" : "Not an armstrong number");
    }
    public static int length(int num){
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static boolean armstrong(int num){
        int temp = num;
        int sum = 0;
        int len = length(num);
        while (num > 0){
            sum = (int) (sum + Math.pow(num % 10, len));
            num /= 10;
        }
        return sum == temp;
    }
}

// Given an integer input, the objective is to check whether the number input is an Armstrong number or not.
// However, Armstrong number is any number following the given rule –
// abcd… = a^n + b^n + c^n + d^n + …
// where n is the order(length/digits in number)