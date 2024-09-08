import java.util.Scanner;
public class Problem_119 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int result = countMagicalNumbers(N);
        System.out.println(result);  // Print the result
    }
    public static boolean isMagical(int number) {
        String binary = Integer.toBinaryString(number);
        int sum = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                sum += 2;
            } else {
                sum += 1;
            }
        }
        return sum % 2 == 1;
    }
    public static int countMagicalNumbers(int N) {
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (isMagical(i)) {
                count++;
            }
        }
        return count;
    }
}