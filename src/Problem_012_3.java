// Method 3 : Using StringBuilder
import java.util.Scanner;
public class Problem_012_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String rev = new StringBuilder(str.toLowerCase()).reverse().toString();
        System.out.println(str.toLowerCase().equals(rev) ? "Palindrome" : "Not a palindrome");
    }
}
