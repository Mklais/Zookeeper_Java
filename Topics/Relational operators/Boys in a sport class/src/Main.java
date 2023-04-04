import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h1 = input.nextInt();
        int h2 = input.nextInt();
        int h3 = input.nextInt();


        boolean ascendingOrDescending = (h1 <= h2 && h2 <= h3) || (h1 >= h2 && h2 >= h3);
        System.out.println(ascendingOrDescending);









        /*
        boolean height2 = (h2<=h1); //TRUE - SMALLER OR EQUAL | FALSE - H2 IS BIGGER THAN H1
        boolean height3 = (h2<=h3); //TRUE - SMALLER OR EQUAL | FALSE - H2 BIGGER THAN H3


        boolean sum1 = height1 && height2;
        boolean sum2 = height2 && height1;
        boolean sum3 = height2 || height3;

        boolean sum1_2 = sum1 && sum2;
        boolean sum2_3 = sum1_2 || sum3;
         */
        
        //SOUTS
        /*
        System.out.println(height1);//TR- BIGGER OR EQUAL
        System.out.println(height2);//TR- SMALLER OR EQUAL
        System.out.println(height3);// TR- SMALLER OR EQUAL

        System.out.println("//this is a break//");

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        System.out.println("//this is a break//");
         */


    }
}