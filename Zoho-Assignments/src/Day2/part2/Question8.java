//Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
package Day2.part2;

import java.util.Scanner;
public class Question8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ages = new int[10];

        int countChild = 0;
        int countAdult = 0;
        int countSenior = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter age of person " + (i + 1) + ": ");
            ages[i] = scan.nextInt();

            if (ages[i] < 18) {
                countChild++;
            } else if (ages[i] <= 60) {
                countAdult++;
            } else {
                countSenior++;
            }
        }

        System.out.println("\n--- Age Group Summary ---");
        System.out.println("Children (<18): " + countChild);
        System.out.println("Adults (18 to 60): " + countAdult);
        System.out.println("Seniors (>60): " + countSenior);
    }

}
