// Find the Armstrong Numbers in a given Range using Java
// Method 1
import java.util.Scanner;
public class Problem_014_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        armstrong(left, right);

    }
    public static int length(int num){
        int count = 0;
        while (num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
    public static void armstrong(int left, int right){
        for (int i = left; i <= right; i++){
            int sum = 0;
            int num = i;
            int length = length(num);
            while (num != 0){
                sum += (int) Math.pow(num % 10, length);
                num /= 10;
            }
            if (sum == i){
                System.out.print(i + " ");
            }
        }
    }
}