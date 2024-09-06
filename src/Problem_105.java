import java.util.Scanner;
public class Problem_105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int min = scanner.nextInt();
        int numeric = 0;
        int capital = 0;
        if (str.length() >= min) {
            if (Character.isDigit(str.charAt(0))){
                System.out.println("Invalid");
                System.exit(0);
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ' || str.charAt(i) == '+'){
                    System.out.println("Invalid");
                    System.exit(0);
                }
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                    capital++;
                }
                if (Character.isDigit(str.charAt(i))){
                    numeric++;
                }
            }
            if (capital > 0 && numeric > 0){
                System.out.println("Valid");
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
