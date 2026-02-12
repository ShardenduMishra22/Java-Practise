public class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int square(int x) {
        int result = x * x;
        return result;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int sum(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }

    public static void main(String[] args) {
        // int result = add(5, 3);
        // System.out.println(result);
    
        // int squareResult = square(4);
        // System.out.println(squareResult);

        // double doubleResult = add(2, 3);
        // System.out.println(doubleResult);

        // int arr[] = {1, 2, 3, 4, 5};
        // int sumResult = sum(arr);
        // System.out.println(sumResult);

        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        for (int i = 0; i < arr.length; i++) { 
            System.out.println(arr[i]); 
        }
    }
}