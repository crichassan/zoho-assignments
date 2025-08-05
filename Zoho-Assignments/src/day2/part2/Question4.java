//Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
package day2.part2;
import java.util.Scanner;
import java.util.Arrays;

public class Question4 {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a Range of Array :");

        int num = scan.nextInt();

        int[] arr = new int[num];

        int singleSum = 0;
        int doubleSum = 0;

        for(int i=0;i<num;i++){
            System.out.println("Enter a Number" +(i+1));
            arr[i] = scan.nextInt();
            if(arr[i]>=0 && arr[i]<=9){
                singleSum += arr[i];
            }
            else if(arr[i]>=10 && arr[i]<=99 ){
                doubleSum += arr[i];
            }

        }
        System.out.println("The Double Digit Number Sum is : "+doubleSum);
        System.out.println("The Single Digit Number Sum is : "+singleSum);
	}

}
