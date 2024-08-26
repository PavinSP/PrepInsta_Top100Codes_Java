// Method 5: Using with toCharArray
import java.util.Scanner;
public class Problem_012_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(rev(str.toLowerCase()) ? "Palindrome" : "Not a palindrome");
    }
    public static boolean rev(String str){
        char[] arr = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;
        while (i < j){
            if (arr[i] != arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}