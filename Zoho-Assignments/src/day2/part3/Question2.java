//Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
/*For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1 */
package day2.part3;
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp=sc.nextInt();
        String res="";
        while(inp>0){
            inp--;
            res=res+(char)(inp%26+'A');
            inp=inp/26;
        }
        System.out.println(res);
    }
}
