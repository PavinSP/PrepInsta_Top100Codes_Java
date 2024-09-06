import java.util.Scanner;

public class Problem_103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int d = scanner.nextInt();
        int q = scanner.nextInt();
        int r = scanner.nextInt();
        int dividend = (d * q) + r;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == dividend){
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }
}
