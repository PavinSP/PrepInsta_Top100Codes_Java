import java.util.Scanner;
public class Problem_115 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            if (i % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}