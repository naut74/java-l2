public class DemoSum {
    public static int sum(int i1, int i2) {
        int result = 0;
        for (int i = i1; i <= i2; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("sum from 1 to 10 is " + sum(1, 10));
        System.out.println("sum from 60 to 67 is " + sum(60, 67));
        System.out.println("sum from 34 to 50 is " + sum(34, 50));
    }
}
