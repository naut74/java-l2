import java.util.Scanner;

public class InputToArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        int number;
        int position;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a size: ");
            size = input.nextInt();
            if ( size > 10) {
                System.out.println("size does not exceed 10");
            }
        } while (size > 10);

        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Enter element " + (i + 1) + " is: ");
            arr[i] = input.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.print("\nEnter position you want to input: ");
        position = input.nextInt();
        System.out.print("\nEnter number you want to input: ");
        number = input.nextInt();

        if (position < 0 || position > arr.length) {
            System.out.println("Invalid position");
        } else {
            int[] newArr = new int[arr.length + 1];
            for (int j = 0; j < position; j++) {
                newArr[j] = arr[j];
            }
            newArr[position] = number;
            for (int j = position; j < arr.length; j++) {
                newArr[j + 1] = arr[j];
            }
            System.out.printf("\n%-20s%s", "Input to array: ", "");
            for (int j = 0; j < newArr.length; j++) {
                System.out.print(newArr[j] + "\t");
            }
        }
    }
}
