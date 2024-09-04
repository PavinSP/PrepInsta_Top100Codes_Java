// Method 3: Using Static Variable
import java.util.Scanner;
public class Problem_015_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        fibonacci(num);
    }
    public static void fibonacci(int num){
        int[] arr = new int[num + 1];
        arr[0] = 0;
        arr[1] = 1;
        System.out.print(arr[0] + " " + arr[1]);
        for (int i = 2; i < num; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.print(" " + arr[i]);
        }
    }
}
