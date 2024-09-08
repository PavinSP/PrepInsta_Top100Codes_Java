import java.util.Scanner;

public class Problem_116 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.next();
        }
        int max_version = 0;
        for (String s : arr) {
            if (s.startsWith("File_")) {
                String version_ = s.substring(5);
                int version = Integer.parseInt(version_);
                if (version > max_version) {
                    max_version = version;
                }
            }
        }
        System.out.println(max_version);
    }
}