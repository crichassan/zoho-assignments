/*Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.*/
package Day2.part3;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
	     Scanner scan = new Scanner(System.in);

	        System.out.print("Enter a First Number In String : ");
	        String str1 = scan.nextLine();
	        System.out.print("Enter a First Second In String : ");
	        String str2 = scan.nextLine();

	        int num1 =0;
	        int num2 =0;

	        for(int i=0;i<str1.length();i++){
	            char ch = str1.charAt(i);
	            num1 = (num1 *10) +(ch - '0');

	        }
	        for(int i=0;i<str2.length();i++){
	            char ch = str2.charAt(i);
	            num2 = (num2 *10) +(ch - '0');

	        }

	        int sum = num1+num2;
	        System.out.println(""+sum);

	}

}
