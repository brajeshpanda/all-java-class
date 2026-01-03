
interface MyInterface {
    // Static method
    static void staticMethod() {
        System.out.println("Static method in MyInterface");
    }

    // Default method
    default void defaultMethod() {
        System.out.println("Default method in MyInterface");
    }
}

class MyClass implements MyInterface {
    // Explicitly overriding the default method
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in MyClass");
    }
    static void staticMethod() {
        System.out.println("overridden static method in MyInterface");
    }
}

public class FunctionalInterfaceMethods {
    public static void main(String[] args) {


        MyInterface.staticMethod();

        MyClass myClass = new MyClass();

        myClass.staticMethod();

        myClass.defaultMethod();
    }
}
