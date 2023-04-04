import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       // Read the first moment of time
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();

        // Read the second moment of time
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        // Convert both moments to seconds
        int totalSeconds1 = hours1 * 3600 + minutes1 * 60 + seconds1;
        int totalSeconds2 = hours2 * 3600 + minutes2 * 60 + seconds2;

        // Calculate the difference in seconds between the two moments
        int diffSeconds = totalSeconds2 - totalSeconds1;

        // Output the result
        System.out.println(diffSeconds);

        //////////////////////////////////

        /*
        // Read the third moment of time
        int hours3 = scanner.nextInt();
        int minutes3 = scanner.nextInt();
        int seconds3 = scanner.nextInt();

        // Read the fourth moment of time
        int hours4 = scanner.nextInt();
        int minutes4 = scanner.nextInt();
        int seconds4 = scanner.nextInt();

        // Convert both moments to seconds
        int totalSeconds3 = hours3 * 3600 + minutes3 * 60 + seconds3;
        int totalSeconds4 = hours4 * 3600 + minutes4 * 60 + seconds4;

        // Calculate the difference in seconds between the two moments
        int diffSeconds2 = totalSeconds4 - totalSeconds3;

        // Output the result
        System.out.println(diffSeconds2);
        */
        





    }
}
