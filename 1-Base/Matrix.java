public class Matrix {
    public static int max(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String args[]) {
        int arr[] = {10, 20, 5, 30, 15};

        int maxValue = max(arr); System.out.println("Maximum value: " + maxValue);
    }
}