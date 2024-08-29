public class rough {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");  // 0 1 2 3 -> 1 2 3 4
        }
        for (int i : arr){
            System.out.print(i + " "); // 1 2 3 4
        }
    }
}
