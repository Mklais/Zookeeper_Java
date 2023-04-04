import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int max = 0;
       int num;

        do {
            num = input.nextInt();

            if (max < num) {
                max = num;
            }

        } while (num != 0);
        System.out.println(max);
    }
}