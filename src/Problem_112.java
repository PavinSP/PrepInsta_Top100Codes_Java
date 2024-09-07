import java.util.Scanner;
public class Problem_112 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int max_prod = 0;
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == 18) {
                    int temp = arr[i] * arr[j];
                    if (temp > max_prod ){
                        max_prod = temp;
                        result[0] = arr[j];
                        result[1] = arr[i];
                    }
                }
            }
        }
        System.out.println("{" + result[0] + "," + result[1] + "}");
    }
}
