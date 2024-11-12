package SumOfCol;
import java.util.Scanner;

public class SumOfCol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = input.nextInt();

        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("Array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.print("\nEnter column you want to sum: ");
        int col = input.nextInt() ;
        int sum = 0;

        if (col >= 0 && col < cols) {
            for (int i = 0; i < rows; i++) {
                sum += array[i][col];
            }
            System.out.printf("Sum of column %d is: %d", col, sum);
        } else {
            System.out.println("Invalid column number!");
        }
    }
}
