/*2. Can we override private method, constructor, static method, final method? Illustrate with an example.*/
package Day5;

class Parent {
    // Public method (can be overridden)
    public void show() {
        System.out.println("Parent: show()");
    }

    // Private method (cannot be overridden)
    private void privateMethod() {
        System.out.println("Parent: privateMethod()");
    }

    // Static method (method hiding)
    static void staticMethod() {
        System.out.println("Parent: staticMethod()");
    }

    // Final method (cannot be overridden)
    public final void finalMethod() {
        System.out.println("Parent: finalMethod()");
    }

    // Constructor (cannot be overridden)
    Parent() {
        System.out.println("Parent: Constructor");
    }

    // Calling private method inside Parent
    public void callPrivate() {
        privateMethod();
    }
}

class Child extends Parent {
    // Overriding public method
    @Override
    public void show() {
        System.out.println("Child: show()");
    }

    // This is NOT overriding; it's a new method (private methods are not inherited)
    public void privateMethod() {
        System.out.println("Child: privateMethod()");
    }

    // Method hiding (not overriding)
    static void staticMethod() {
        System.out.println("Child: staticMethod()");
    }

    // ❌ Can't override finalMethod()
    // public void finalMethod() {
    //     System.out.println("Child: finalMethod()");
    // }

    // Constructor (not overriding)
    Child() {
        System.out.println("Child: Constructor");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        System.out.println("=== Creating Parent Object ===");
        Parent p = new Parent();
        p.show();              // Parent's show()
        p.callPrivate();       // Calls Parent's privateMethod()
        Parent.staticMethod(); // Calls Parent's static method
        p.finalMethod();       // Final method

        System.out.println("\n=== Creating Child Object ===");
        Child c = new Child();
        c.show();              // Overridden method
        c.privateMethod();     // Child's method, not override
        Child.staticMethod();  // Method hiding
        c.finalMethod();       // Inherited final method

        System.out.println("\n=== Upcasting Child to Parent ===");
        Parent pc = new Child();
        pc.show();             // Polymorphism: Child's show()
        pc.finalMethod();      // Final method from Parent
        pc.staticMethod();     // Static method from Parent (method hiding, not polymorphism)
    }
}
