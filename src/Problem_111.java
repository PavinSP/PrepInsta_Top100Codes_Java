import java.util.Scanner;

public class Problem_111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int odd = 0;
        int even = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                even ^= arr[i];
            } else {
                odd += arr[i];
            }
        }
        int result = odd - even;
        System.out.println(Math.abs(result));
    }
}