import java.util.Scanner;
public class Problem_109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int Vi = scanner.nextInt();
        int Vf = scanner.nextInt();
        int e_n = Vi / Vf;
        int final_height = H * ((int) Math.pow(e_n, 2));
        System.out.println(final_height);
    }
}
