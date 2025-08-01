//Write a program to check if a number is a power of 2?
package Day1;

public class Question7 {

	public static void main(String[] args) {
		
		int n = 5;
		int b = n;
		if(n<=0) {
			System.out.println(b + " is not a power of 2");
		}
		else {
			while(n%2==0) {
				n = n/2;
			}
		}
		//check power of 2
		if(n==1) {
			System.out.println( b +" is a power of 2");
		}
		else {
			System.out.println(b +" is not a power of 2");
		}
		

	}

}
