//Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
package Day2.part2;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;

        System.out.println("Enter 10 integers:");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }

        System.out.println("Sum of all odd numbers = " + sum);
    }
}
