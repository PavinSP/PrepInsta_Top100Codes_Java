import java.util.Scanner;
public class Problem_118 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        double area = d * d * 3.14;
        if (area - (int) area > 0.5){
            System.out.println((int) area + 1);
        }
        else{
            System.out.println((int) area);
        }
    }
}
