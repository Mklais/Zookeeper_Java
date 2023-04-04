import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;

        while(input.nextInt() != 0 ){
            count++;
        }

        input.close();
        System.out.println(count);

    }
}