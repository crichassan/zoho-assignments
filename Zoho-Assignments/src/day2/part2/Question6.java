//Write a program to accept the year of graduation from school as an integer value from the users . Using the Binary search technique on the sorted array of integers given below . Output the message “record exists" if the value input is located in the array and if not output the message record does not exits”.
//{1982, 1987, 1993, 1996, 1999, 2003, 2006, 2007, 2009, 2010, 2016, 2002}
package day2.part2;

import java.util.Scanner;
import java.util.Arrays;

public class Question6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The No of Years Count :");
        int num = scan.nextInt();
        int[] arr = new int[num];

        for(int i=0;i<num;i++){
            System.out.println("Enter The Value :"+(i+1));
            arr[i] = scan.nextInt();

        }
        int max =arr[0];
        for(int i=0;i<num;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }

        int[] count = new int[max+1];

        for(int i=0;i<num;i++){
            count[arr[i]]++;

        }

        int idx =0;
        for(int i=0;i<=max;i++ ){


            while(count[i]>0){
                arr[idx] = i;
                count[i]--;
                idx++;
            }
        }
        System.out.println("Enter Your Search target : ");
        int target = scan.nextInt();

        int left =0;
        int right = arr.length-1;
        boolean check = false;
        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
               check = true;
                break;
            }
            else if(arr[mid]<target){
                left = mid+1;

            }
            else{
                right = mid-1;
            }
        }
        if(check){
            System.out.println("record exists");
        }
        else{
            System.out.println("record does not exits");
        }

    }
}
