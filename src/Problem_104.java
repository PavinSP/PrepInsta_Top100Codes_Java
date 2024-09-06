import java.util.Scanner;
public class Problem_104 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int m = scanner.nextInt();
        int count = 0;
        for (int i : arr) {
            if (i % 5 == 0) {
                count++;
            } else if (m >= i) {
                count++;
                m -= i;
            }
        }
        System.out.println(count);
    }
}