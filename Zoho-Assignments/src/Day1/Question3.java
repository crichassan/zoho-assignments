//Write a program to find the maximum of two numbers using ternary operator.
package Day1;

public class Question3 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		//ternary operator
     	int max = num1<num2 ? num2 : num1;
     	System.out.println("Max: " + max);
	}

}
