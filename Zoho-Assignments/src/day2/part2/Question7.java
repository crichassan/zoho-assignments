//Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.

package day2.part2;

import java.util.Scanner;
import java.util.Arrays;
public class Question7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Number of weight :");
        int num = scan.nextInt();

        int[] weight = new int[num];

        for(int i=0;i<num;i++){
            System.out.println("Enter A weight of person" +(i+1));
            weight[i] = scan.nextInt();
        }

        for(int i=0;i<num;i++){
            int maxIdx = i;

            for(int j =i+1;j<num;j++){
                if(weight[j]>weight[maxIdx]){
                    maxIdx = j;
                }
            }

            int temp = weight[i];
            weight[i]=weight[maxIdx];
            weight[maxIdx] = temp;
        }

        System.out.println(Arrays.toString(weight));
    }
}
