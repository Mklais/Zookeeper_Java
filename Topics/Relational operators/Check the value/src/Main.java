import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();

        boolean result1 = (val< 10);
        boolean result2 = (val>0);

        //NEEDS BOTH TRUE TO WORK
        boolean compare = result1 && result2;

        System.out.println(compare);

    }
}