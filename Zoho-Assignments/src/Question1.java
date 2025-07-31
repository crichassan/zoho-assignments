//1. Write a code to illustrate the various scope of variables(static, local, instance, block, final variables)?

public class Question1 {

    // Static variable 
    static int staticVar = 100;

    // Instance variable 
    int instanceVar = 50;

    // Final variable 
    final int finalVar;

    // Constructor
    public Question1(int finalValue) {
        finalVar = finalValue; 
    }

    // local and block variable
    public void scopes() {
        // Local variable 
        int localVar = 20;

        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
        System.out.println("Final Variable: " + finalVar);
        System.out.println("Local Variable: " + localVar);

        // Block variable
        for (int i = 0; i < 1; i++) {
            int blockVar = 10;  // block scope
            System.out.println("Block Variable inside for-loop: " + blockVar);
        }

    }

    public static void main(String[] args) {
        Question1 obj1 = new Question1(999);
        obj1.scopes();

        Question1.staticVar = 200;
    }
}

