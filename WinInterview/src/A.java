
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
        System.out.println("br method in MyInterface");
    }
}

public class A {
    public static void main(String[] args) {
        // Calling static method
        MyInterface.staticMethod();

        // Creating an instance of MyClass
        MyClass myClass = new MyClass();
        
        A a= new A();

        // Calling default method
        myClass.defaultMethod();
    }
}
