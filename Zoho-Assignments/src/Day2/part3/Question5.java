/*Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
‌
A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
‌
Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true
‌
Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false
‌
Constraints:
0 <= s.length <= 100
0 <= t.length <= 10^4
s and t consist only of lowercase English letters.
‌
Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 10^9, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?*/
package Day2.part3;
import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Enter a first String : ");

        String s = scan.nextLine();

        System.out.print("Enter a Second String : ");

        String t = scan.nextLine();

        int left =0;
        int right =0;

        while(left<s.length() && right<t.length()){
            if(s.charAt(left) == t.charAt(right)){
                left++;
                right++;
            }
            else{
                right++;
            }
        }

        if(left == s.length()){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

	}

}
