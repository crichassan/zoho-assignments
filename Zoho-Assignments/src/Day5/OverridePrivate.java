/*2. Can we override private method, constructor, static method, final method? Illustrate with an example.*/
package Day5;

public class overridePrivate {


}

class A{
    // Constructor – Cannot Override
    // Constructors are not inherited, so override doesn't make sense.

    /* private A(){
        System.out.println("A Constructor");
    }*/

    private void method(){
        System.out.println("Private Method from A");
    }

    static void staticMethod(){
        System.out.println("Static Method from A");
    }

    final void finalMethod() {
        System.out.println("A's final display");
    }
}

class B extends A{

    /* private B(){
        System.out.println("A Constructor");
    }*/

    // This is Considered as new Method not overrided method
    // You can check by uncommenting the override annotation
    // @Override
    private void method(){
        System.out.println("Private Method from B");
    }

    // @Override
    // static method cannot be overridden
    static void staticMethod(){
        System.out.println("Static Method from A");
    }

    // Final method cannot be overriden
    //final void finalMethod() {
    //      System.out.println("A's final display");
    //}

}