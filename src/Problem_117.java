import java.util.Scanner;
public class Problem_117 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextLine();
        }
        int max_count = 0;
        String result = "No Word";
        for (String s : arr) {
            int count = 0;
            int j = 0;
            if (str.equals(s)) {
                continue;
            }
            while (j < Math.min(str.length(), s.length())) {
                if (str.charAt(str.length() - j - 1) == s.charAt(s.length() - j - 1)) {
                    count++;
                } else {
                    break;
                }
                j++;
            }
            if (count > max_count) {
                max_count = count;
                result = s;
            }
        }
        System.out.println(result);
    }
}
