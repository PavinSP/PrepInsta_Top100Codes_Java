import java.util.Scanner;
public class Problem_125 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '0') {
                str2.append('5');
            }
            else{
                str2.append(str.charAt(i));
            }
        }
        System.out.println(str2);
    }
}
