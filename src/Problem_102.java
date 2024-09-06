import java.util.Scanner;
public class Problem_102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int w = scanner.nextInt();
        int four_wheeler = (w - 2 * v) / 2;
        int two_wheeler = v - four_wheeler;
        System.out.println(two_wheeler);
        System.out.println(four_wheeler);
    }
}