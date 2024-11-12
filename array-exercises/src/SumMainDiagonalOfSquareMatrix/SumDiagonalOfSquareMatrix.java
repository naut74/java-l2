package SumMainDiagonalOfSquareMatrix;
import java.util.Scanner;

public class SumDiagonalOfSquareMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows and cols: ");
        int rowsCols = input.nextInt();

        if (rowsCols > 1 && rowsCols <= 10) {
            int[][] array = new int[rowsCols][rowsCols];
            for (int i = 0; i < rowsCols; i++) {
                for (int j = 0; j < rowsCols; j++) {
                    System.out.printf("Element [%d][%d]: ", i, j);
                    array[i][j] = input.nextInt();
                }
            }

            System.out.println("Array is: ");
            for (int i = 0; i < rowsCols; i++) {
                for (int j = 0; j < rowsCols; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.println();
            }

            int sum = 0;
            for (int i = 0; i < rowsCols; i++) {
                sum += array[i][i];
            }
            System.out.print("\nSum numbers on the main diagonal of a square matrix is: " + sum);
        } else {
            System.out.println("Invalid number");
        }
    }
}

