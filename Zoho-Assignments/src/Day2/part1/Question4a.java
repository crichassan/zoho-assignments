//Write a program to do the following patterns using do...while loop?
//a) Pascal Triangle
package Day2.part1;

import java.util.Scanner;

public class Question4a {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);

	        int num = scan.nextInt();
	        int row =0;
	        int[][] temp =new int[num][num];
	        int len =num;
	        do{
	            int col = 0;
	            int i=0;
	            do{
	                System.out.print(" ");
	                i++;
	            }while(i<len);
	            do{
	                if(col== 0 || col == row ){
	                    temp[row][col] = 1;
	                }
	                else{
	                    temp[row][col] = temp[row-1][col-1] + temp[row-1][col];

	                }
	                System.out.print(temp[row][col] + " ");
	                col++;

	            }while(col<= row);

	            System.out.println();
	            row++;
	            len --;
	        }while(row<num);

	}

}