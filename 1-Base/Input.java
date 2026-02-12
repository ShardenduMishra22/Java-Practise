import java.util.Scanner;

public class Input {
    public static void test(){
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        System.out.println("You entered: " + x);

        sc.close();
    }

    

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter number: ");
        // int x = sc.nextInt();

        // System.out.println("You entered: " + x);
    
        // if (x > 0) {
        //     System.out.println("Positive");
        // } else if (x < 0) {
        //     System.out.println("Negative");
        // } else {
        //     System.out.println("Zero");
        // }

        // for (int i = 1; i <= 5; i++) {
        //     System.out.println(i);
        // }

        // int i = 1;
        // while (i <= 5) {
        //     System.out.println(i);
        //     i++;
        // }

        int[][] matrix = new int[2][3];
        matrix[0][1] = 5;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}