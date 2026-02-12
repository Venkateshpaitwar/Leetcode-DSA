public class Inverse {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 2};
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int val = arr[i];
            result[val-1] = i+1;
        }
        System.out.println("Original array: " + java.util.Arrays.toString(arr));
        System.out.println(java.util.Arrays.toString(result));
    }
}
