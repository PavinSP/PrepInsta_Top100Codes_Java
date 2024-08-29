// Method 2 (Recursive)
import java.util.Scanner;
public class Problem_014_2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        armstrongrange(left, right);
    }
    public static int length(int num){
        int count = 0;
        while (num != 0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static int armstrong(int num, int length){
        if (num == 0) return 0;
        int last = num % 10;
        return (int) Math.pow(last, length) + armstrong(num / 10, length);
    }
    public static void armstrongrange(int left, int right){
        for (int num = left; num <= right; num++){
            int length = length(num);
            if (num == armstrong(num, length)){
                System.out.print(num + " ");
            }
        }
    }
}