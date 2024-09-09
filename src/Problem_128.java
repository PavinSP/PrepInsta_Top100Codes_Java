import java.util.Scanner;
public class Problem_128 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.nextLine();
        String last = scanner.nextLine();
        first = first.toLowerCase();
        last = last.toUpperCase();
        System.out.print(first + " ");
        System.out.println(last);
    }
}