import java.util.Scanner;
public class Problem_108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();
        char ch = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < n; i++){
            if (str.charAt(i) == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
