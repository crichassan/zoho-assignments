/*2. Create a Java application that demonstrates the use of user-defined packages by organising classes based on their
functionality:
--- arithmetic: This package should include a class that defines methods to perform the following operations on two
numbers:
a. Addition
b. Subtraction
c. Multiplication
d. Division
e. Modulo
--- stringutils: This package should include a class that defines methods for:
a. Concatenating two strings
b. Reversing a string
c. Finding the length of a string
In your main class (outside those packages), import the above packages and demonstrate the usage of all the methods*/
package Day6;

import Day6.Mathematic;
import Day6.StringUtility;

public class PackagesDemo {
    public static void main(String[] args) {

        System.out.println("-------------Mathematic Class Demo-------------\n");
        // Mathematic.add()
        System.out.println("add() : "+Mathematic.add(44, 33));
        // Mathematic.subtract()
        System.out.println("subtract() : "+Mathematic.subtract(44, 33));
        // Mathematic.multiply()
        System.out.println("multiply() : "+Mathematic.multiply(44, 33));
        // Mathematic.divide()
        System.out.println("divide() : "+Mathematic.divide(44, 10));
        // Mathematic.modulo()
        System.out.println("modulo() : "+Mathematic.modulo(44, 33));

        System.out.println("\n ------------StringUtil Class Demo-------------\n");

        String myStr1 = "MADHUBALAN";
        String myStr2 = "Pavoorchatram";

        // StringUtility.length()
        System.out.println("length() : "+StringUtility.length(myStr2));

        // StringUtility.concat()
        System.out.println("concat() : "+StringUtility.concat(myStr1,myStr2));

        // StringUtility.reverse()
        System.out.println("reverse() : "+StringUtility.reverse(myStr1));

        System.out.println();
    }
}
