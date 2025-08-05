

//8. We define the usage of capitals in a word to be right when one of the following cases holds:
//1. All letters in this word are capitals, like "USA".
//2. All letters in this word are not capitals, like "leetcode".
//3. Only the first letter in this word is capital, like "Google".
//Given a string word, return true if the usage of capitals in it is right.
//Example 1:
//Input: word = "USA"
//Output: true
//‌
//Example 2:
//Input: word = "FlaG"
//Output: false
//‌
//Constraints:
//1 <= word.length <= 100
//word consists of lowercase and uppercase English letters.
package Day2.part3;
import java.util.Scanner;
public class Question8 {

  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      System.out.print("Enter a String : ");

      String str = scan.nextLine();
      int count =0;
      for(int i=0;i<str.length();i++){
          if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
              count++;
          }

      }

      if(count == str.length()) {
          System.out.println(true);
          return;
      }

      else if(count ==0){
          System.out.println(false);
          return;
      }

      else if(count ==1 && (str.charAt(0)>='A' && str.charAt(0)<='Z')){
          System.out.println(true);
          return;
      }
  }
}