//Write a program that illustrate the execution order of static block and initializer block?
package Day1;

public class Question5{

    // Static block
    static {
        System.out.println("Static Block: Executed when class is loaded.");
    }

    // Instance initializer block
    {
        System.out.println("Initializer Block: Executed before constructor.");
    }

    // Constructor
    public Question5() {
        System.out.println("Constructor: Executed after initializer block.");
    }

    public static void main(String[] args) {
    	
        System.out.println("Main Method: Starts here....");

        System.out.println();
        Question5 obj1 = new Question5();

    }
}

