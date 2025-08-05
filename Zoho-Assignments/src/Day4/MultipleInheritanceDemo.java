/* Write a program to illustrate that Classes cannot be used for multiple Inheritance*/
/*In Java, multiple inheritance with classes is not allowed — that means a class cannot extend more 
 than one class directly. This is to avoid ambiguity problems like the Diamond Problem.
 What You Can Use Instead: Interfaces
 If you need multiple inheritance behavior in Java, you should use interfaces, which do support multiple inheritance.*/
package Day4;

interface A {
    void displayA();
}

interface B {
    void displayB();
}

class C implements A, B {
    public void displayA() {
        System.out.println("This is A");
    }

    public void displayB() {
        System.out.println("This is B");
    }
}

public class MultipleInheritanceDemo{
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA();
        obj.displayB();
    }
}
