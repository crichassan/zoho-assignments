/* Given a string s, return the number of segments in the string.
 A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.*/
package day2.part3;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String s = scan.nextLine();

        int len = s.length();
        if(len ==0){
            System.out.println(0);
            return;
        }
        String str ="";
        int count=0;

        for(int i=0;i<len;i++){
            if(s.charAt(i) == ' '){
                if(str.length()>0){
                    count++;
                    str = "";
                }
            }
            else{
                str += s.charAt(i);
            }

        }

        if(str.length()>0){
            System.out.println(count+1);
            return;
        }
        System.out.println(count);



    }
}
