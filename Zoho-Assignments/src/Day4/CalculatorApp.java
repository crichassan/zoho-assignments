/*Design a calculator application using Java Inheritance. Create the following class hierarchy:
--->BasicCalculator (Base class):
Implement all the basic arithmetic methods, such as:
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
--->AdvancedCalculator (Inherits from BasicCalculator)
Add 3 to 4 advanced mathematical operations, such as:
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
--->ScientificCalculator (Inherits from AdvancedCalculator)
Add scientific functions, such as:
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three
levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.*/
package Day4;

//Base class
class BasicCalculator {
 public int add(int a, int b) {
     return a + b;
 }

 public int subtract(int a, int b) {
     return a - b;
 }

 public int multiply(int a, int b) {
     return a * b;
 }

 public int divide(int a, int b) {
     if (b == 0) {
         System.out.println("Error: Cannot divide by zero");
         return 0;
     }
     return a / b;
 }
}

//Derived class 1
class AdvancedCalculator extends BasicCalculator {
 public double power(int base, int exponent) {
     return Math.pow(base, exponent);
 }

 public int modulus(int a, int b) {
     return a % b;
 }

 public double squareRoot(double number) {
     if (number < 0) {
         System.out.println("Error: Cannot take square root of negative number");
         return -1;
     }
     return Math.sqrt(number);
 }

 // Optional: override divide method to return double
 @Override
 public int divide(int a, int b) {
     System.out.println("Advanced divide used");
     return super.divide(a, b); // Still returning int for consistency
 }
}

//Derived class 2
class ScientificCalculator extends AdvancedCalculator {
 public double sin(double angle) {
     return Math.sin(Math.toRadians(angle)); // angle in degrees
 }

 public double cos(double angle) {
     return Math.cos(Math.toRadians(angle));
 }

 public double log(double value) {
     if (value <= 0) {
         System.out.println("Error: Logarithm undefined for value <= 0");
         return -1;
     }
     return Math.log(value); // Natural log
 }

 public double exp(double value) {
     return Math.exp(value);
 }
}

public class CalculatorApp {
 public static void main(String[] args) {
     ScientificCalculator calc = new ScientificCalculator();

     System.out.println("=== Basic Calculator Functions ===");
     System.out.println("Add: " + calc.add(10, 5));
     System.out.println("Subtract: " + calc.subtract(10, 5));
     System.out.println("Multiply: " + calc.multiply(10, 5));
     System.out.println("Divide: " + calc.divide(10, 5));

     System.out.println("\n=== Advanced Calculator Functions ===");
     System.out.println("Power: " + calc.power(2, 4));
     System.out.println("Modulus: " + calc.modulus(10, 3));
     System.out.println("Square Root: " + calc.squareRoot(25));

     System.out.println("\n=== Scientific Calculator Functions ===");
     System.out.println("Sin(30): " + calc.sin(30));
     System.out.println("Cos(60): " + calc.cos(60));
     System.out.println("Log(10): " + calc.log(10));
     System.out.println("Exp(2): " + calc.exp(2));
 }
}
