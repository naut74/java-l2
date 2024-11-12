import java.util.Scanner;
public class MergeArray {
    public static void main(String[] args) {
        int size1;
        int size2;
        int[] array1;
        int[] array2;
        int[] array3;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a size array 1: ");
            size1 = input.nextInt();
            if (size1 > 10) {
                System.out.println("size does not exceed 10");
            }
        } while (size1 > 10);
        array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter element " + (i + 1) + " is: ");
            array1[i] = input.nextInt();
        }
        do {
            System.out.print("\nEnter a size array 2: ");
            size2 = input.nextInt();
            if (size2 > 10) {
                System.out.println("size does not exceed 10");
            }
        } while (size2 > 10);
        array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element " + (i + 1) + " is: ");
            array2[i] = input.nextInt();
        }

        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array1.length; j++) {
            System.out.print(array1[j] + "\t");
        }
        System.out.printf("\n%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }

        array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        System.out.printf("\n%-20s%s", "Merge array 1 and array 2: ", "");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
