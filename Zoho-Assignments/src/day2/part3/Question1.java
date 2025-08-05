//1. Given two binary strings a and b, return their sum as a binary string.
//Input: a = "11", b = "1"
//Output: "100"
//Input: a = "1010", b = "1011"
//Output: "10101"
//Constraints:
//1 <= a.length, b.length <= 10^4
//a and b consist only of '0' or '1' characters.
//Each string does not contain leading zeros except for the zero itself.
package day2.part3;


public class Question1{
    public static void main(String[] args) {
        String a ="11";
        String b ="1";
        int left = a.length()-1;
        int right = b.length()-1;
        int carry =0;
        StringBuilder output = new StringBuilder("");
        while(left>=0 || right>=0 || carry ==1){
            int temp1 = left>=0 ? a.charAt(left--)-'0':0;
            int temp2 = right>=0 ? b.charAt(right--)-'0':0;

            int sum = temp1 ^ temp2 ^ carry;
            carry = (temp1 & temp2) | (temp1 & carry) | (temp2 & carry);
            output.append(sum);

        }
        System.out.println(output.reverse().toString());
    }
}