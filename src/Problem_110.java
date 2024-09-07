import java.util.Scanner;

public class Problem_110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
            if (arr[i] % 2 == 0) {
                System.out.print("Even");
            }
            else{
                System.out.print("Odd");
            }
        }
    }
}
