import java.util.Scanner;
public class Problem_124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] * arr[j] % 3 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
