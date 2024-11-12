import java.util.Scanner;
public class MinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of cols: ");
        int cols = input.nextInt();

        int[][] array = new int[rows][cols];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
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

        int min = array[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        System.out.printf("\nMax in array is: " + min);
    }
}
