import java.util.Scanner;
public class Problem_127 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
