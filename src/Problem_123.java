import java.util.Scanner;
public class Problem_123 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int a_count = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                if (arr[i] >= 3) {
                    arr[i] -= 3;
                    a_count++;
                }
                else if (arr[i] >= 2) {
                    arr[i] -= 2;
                    a_count++;
                }
                else if (arr[i] >= 1) {
                    arr[i] -= 1;
                    a_count++;
                }
            }
        }
        System.out.println(a_count);
    }
}
