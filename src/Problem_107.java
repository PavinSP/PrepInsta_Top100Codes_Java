import java.util.Scanner;

public class Problem_107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int left = 0;
        int right = str.length() - 1;
        while (left <= right){
            if (str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }
            else{
                System.out.println(0);
                System.exit(0);
            }
        }
        System.out.println(1);
    }
}
