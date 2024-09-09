import java.util.Scanner;

public class Problem_126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        if (n <= 1){
            System.out.println(0);
            System.exit(0);
        }
        for (int i = 2; i <= n; i++){
            if (isPrime(i)){
                sum += i;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int n){
        boolean prime = true;
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                prime = false;
                break;
            }
        }
        return prime;
    }
}