import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //the task is to count the number of desks to order the correct
        // number from the shop.
        // Of course, the university is short of money, so you need to calculate
        // the minimum number of desks. But don't forget that each group will sit in
        // its own classroom!


        //How many students in 3 different groups
        int group1 = scanner.nextInt();
        int group2 = scanner.nextInt();
        int group3 = scanner.nextInt();

        //Minimum of 2 people behind the desk, so remainder of the students.
        int class1 = group1 % 2;
        int class2 = group2 % 2;
        int class3 = group3 % 2;

        // Is there any students sitting alone (min. req. 1)
        int desk1 = group1 / 2;
        int desk2 = group2 / 2;
        int desk3 = group3 / 2;

        // sum of all the students in 3 different classes
        int sumOfClass = class1 + class2 + class3;

        // Result is sum of all the students and the sum of the students IF
        // any student is sitting alone
        int result = sumOfClass + (desk1 + desk2 + desk3);

        System.out.println(result);

    }
}