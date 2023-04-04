import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int value = input.nextInt();

        if (-15 < value && value <= 12) {
            System.out.println("True");
        } else if (14 < value && value < 17) {
            System.out.println("True");
        } else if (19 <= value) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}