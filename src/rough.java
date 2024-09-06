// Problem 1 // find the count of the given character

//import java.util.Scanner;
//public class rough{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        int length = scanner.nextInt();
//        char ch = scanner.next().charAt(0);
//        int count = 0;
//        for (int i = 0; i < length; i++){
//            if (str.charAt(i) == ch){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}

// Problem 2

//// arr (int)
//// length of arr
//// find:
//
//import java.util.Arrays;
//import java.util.Scanner;
//public class rough{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = scanner.nextInt();
//        }
//        String[] str = new String[n];
//        for (int i = 0; i < arr.length; i++){
//            if (arr[i] % 2 == 0){
//                System.out.print("Even ");
//            }
//            else{
//                System.out.print("Odd ");
//            }
//        }
//    }
//}

// Problem 3

//import java.util.Scanner;
//public class rough {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        String[] arr = new String[n];
//        char max = 0;
//        String max_file = null;
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextLine();
//            if (arr[i].charAt(arr[i].length() - 1) > max) {
//                max = arr[i].charAt(arr[i].length() - 1);
//                max_file = arr[i];
//            }
//
//        }
//        System.out.println(max_file);
//    }
//}

// Problem 4
 //import java.util.Scanner;
//public class rough {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = scanner.nextInt();
//        }
//        for (int i = 0; i < arr.length/2; i++){
//            int tem = arr[i];
//            arr[i] = arr[n-i-1];
//            arr[n-i-1] = tem;
//        }
//        int sum = 0;
//        for (int i = 1; i < arr.length; i += 2) {
//            sum += arr[i];
//        }
//        System.out.println(sum);
//    }
//}