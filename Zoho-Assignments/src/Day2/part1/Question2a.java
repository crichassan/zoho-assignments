//Write a program to do the following patterns using for loop?
//a) 1 1 R R R R
//1 1 R R
//1 R R R R
//1 1 R R
//1 1 R R
package Day2.part1;
import java.util.Scanner;

public class Question2a {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Number of Rows and Colums : ");
        int num = scan.nextInt();
        int count =num-1;
        int mid = num/2;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i == j && j != mid){
                    System.out.print("1");
                }
                
                if(j==count ){
                    System.out.print("1");
                    count--;
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

	}

}
