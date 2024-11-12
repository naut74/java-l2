import java.util.Scanner;

public class RemoveArray {
    public static void main(String[] args) {
        int size;
        int[] arr;
        int number;
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

        System.out.print("\nEnter number you want to remove: ");
        number = input.nextInt();
        for (int j = 0; j <= arr.length - 2; j++) {
            if(arr[j] == number) {
                arr[j] = arr[j+1];
            }
        }
        int[] newArr = new int[arr.length - 1];
        System.out.printf("\n%-20s%s", "Remove array: ", "");
        for (int j = 0; j < newArr.length; j++) {
            newArr[j] = arr[j];
            System.out.print(newArr[j] + "\t");
        }
    }
}
