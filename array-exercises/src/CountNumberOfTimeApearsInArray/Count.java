package CountNumberOfTimeApearsInArray;
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = input.nextLine();

        System.out.print("\nEnter char: ");
        char ch = input.next().charAt(0);

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.printf("Count of time appear %c is: %d", ch, count);
    }
}
