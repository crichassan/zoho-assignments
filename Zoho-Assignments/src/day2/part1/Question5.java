//5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.
package day2.part1;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Range of sum :");

        int num = scan.nextInt();
        int sum =0;
        for(int i=0;i<num;i++){
            if(i%2 !=0) continue;

            sum += i;
        }
        System.out.println("The Total Sum is  : "+sum);
	}

}
