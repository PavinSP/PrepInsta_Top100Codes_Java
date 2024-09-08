import java.util.Scanner;
public class Problem_120 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            if (arr[i] < 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
