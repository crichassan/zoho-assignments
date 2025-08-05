// Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
//● To input elements into matrix of size m x n
//● To display elements of matrix of size m x n
//● Sum of all elements of matrix of size m x n
//● To display row-wise sum of matrix of size m x n
//● To display column-wise sum of matrix of size m x n
//● To create transpose of matrix of size n x m
package day2.part2;

import java.util.Scanner;

public class Question10{


    public static void inputMatrix(int[][] matrix, int m, int n, Scanner sc) {
        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }


    public static void displayMatrix(int[][] matrix, int m, int n) {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void totalSum(int[][] matrix, int m, int n) {
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }


    public static void rowWiseSum(int[][] matrix, int m, int n) {
        System.out.println("Row-wise sum:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + i + " = " + rowSum);
        }
    }


    public static void columnWiseSum(int[][] matrix, int m, int n) {
        System.out.println("Column-wise sum:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + j + " = " + colSum);
        }
    }


    public static void transpose(int[][] matrix, int m, int n) {
        System.out.println("Transpose Matrix:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input Matrix");
            System.out.println("2. Display Matrix");
            System.out.println("3. Sum of All Elements");
            System.out.println("4. Row-wise Sum");
            System.out.println("5. Column-wise Sum");
            System.out.println("6. Transpose Matrix");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inputMatrix(matrix, m, n, sc);
                    break;
                case 2:
                    displayMatrix(matrix, m, n);
                    break;
                case 3:
                    totalSum(matrix, m, n);
                    break;
                case 4:
                    rowWiseSum(matrix, m, n);
                    break;
                case 5:
                    columnWiseSum(matrix, m, n);
                    break;
                case 6:
                    transpose(matrix, m, n);
                    break;
                case 0:
                    System.out.println("Exiting Program.");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
