import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Here we set the string
        String text = scanner.nextLine();

        // Here we create a boolean for the string set above.
        // This boolean uses a "OR" gate to find if the input by user is true
        boolean input = text.startsWith("j") || text.startsWith("J");

        System.out.println(input);
    }
}