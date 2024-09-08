import java.util.HashMap;
import java.util.Scanner;
public class Problem_121_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        HashMap<String, String> map = new HashMap<>();
        map.put("Scissor", "Rock");
        map.put("Paper", "Scissor");
        map.put("Rock", "Paper");
        System.out.println(map.get(input));
    }
}
