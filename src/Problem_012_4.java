// Method 4: Using for loop and charAt
import java.util.Scanner;
public class Problem_012_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(rev(str.toLowerCase()) ? "Palindrome" : "Not a palindrome");
    }
    public static boolean rev(String str){
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }
        return str.equals(rev);
    }
}