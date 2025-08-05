//Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.
package day2.part2;

import java.util.Scanner;

public class Question9{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numStudents = 10;
        int[][] marks = new int[numStudents][3];  // 3 subjects per student
        int[] rollNo = new int[numStudents];

        System.out.println("Enter Roll No and 3 Subject Marks for 10 Students:");

        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Roll No: ");
            rollNo[i] = scan.nextInt();

            for (int j = 0; j < 3; j++) {
                System.out.print("Subject " + (j + 1) + " Marks: ");
                marks[i][j] = scan.nextInt();
            }
        }

        System.out.println("\n-----------------------------------------------------");
        System.out.println( "Roll No   Total Marks   Average");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < numStudents; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;

            System.out.printf("%-10d %-15d %-10.2f\n", rollNo[i], total, avg);
        }

        System.out.println("-----------------------------------------------------");
    }

}
