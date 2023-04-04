import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

      boolean condition1 = (a + b > c);
      boolean condition2 = (a + c > b);
      boolean condition3 = (b + c > a);

      boolean subresult1 = condition1 && condition2;
      boolean subresult2 = subresult1 && condition3;
        if (subresult2 == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


    }
}