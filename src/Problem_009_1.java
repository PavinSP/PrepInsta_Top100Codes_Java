// Write a program to check if a given number is prime or not in java
// Method 1: Simple iterative solution
import java.util.Scanner;
public class Problem_009_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 2) {
            System.out.println("Not a prime");
            System.exit(0);
        }
        int count = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                count++;
            }
        }
        if (count > 2) System.out.println("Not a Prime");
        else System.out.println("Prime");
    }
}