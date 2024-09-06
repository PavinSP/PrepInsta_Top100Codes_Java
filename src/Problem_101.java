import java.util.Scanner;
public class Problem_101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int unit = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        int total_food = r * unit;
        for (int i : arr) {
            if (total_food > 0) {
                total_food -= i;
                count++;
            }
        }
        System.out.println(count);
    }
}
