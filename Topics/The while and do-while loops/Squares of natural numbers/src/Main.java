import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();

        int value = 1;

        /* THIS IS ASCENDING
        while (n > 0){
            int sqrt = (int) Math.sqrt(n);
            if (n == sqrt * sqrt) {
                System.out.println(n);
            }
            n--;
        }
         */

        // IN DESCENDING
        while (value <= n) {
            int sqrt = (int) Math.sqrt(value);
            if (value == sqrt * sqrt) {
                System.out.println(value);
            }
            value++;
        }

    }
}