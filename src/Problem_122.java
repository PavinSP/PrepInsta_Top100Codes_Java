import java.util.Arrays;
import java.util.Scanner;

public class Problem_122{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i <= arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        int refuel_stops = 0;
        int extra_fuel = 0;
        for (int i : arr) {
            int current_fuel = i + extra_fuel;
            if (current_fuel >= x) {
                extra_fuel = current_fuel - x;
            } else {
                refuel_stops++;
                extra_fuel = 0;
            }
        }
        System.out.println(refuel_stops);
    }
}