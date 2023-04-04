import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        n = input.nextInt();
        System.out.print(n + " "); //Initial value output

        while (n != 1) {
            if (n % 2 == 0) { //IF it is even number - go do this block
                int even = n / 2;
                System.out.print(even + " ");
                n = even;
            } else {
                int odd = (3 * n +1);
                System.out.print(odd + " ");
                n = odd;
            }
        }

        System.out.println();
    }
}