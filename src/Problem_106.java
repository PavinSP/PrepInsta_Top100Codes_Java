import java.util.HashMap;
import java.util.Scanner;
public class Problem_106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int freq = map.getOrDefault(arr[i], 0);
            if (freq == 0){
                count++;
            }
            else if(freq == 1){
                count--;
            }
            map.put(arr[i], freq + 1);
        }
        System.out.println(count);
    }
}
