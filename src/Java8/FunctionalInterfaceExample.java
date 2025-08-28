package Java8;

@FunctionalInterface
public interface FunctionalInterfaceExample {
    String myMethod(String str);

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public class testMain{
        public static void main(String[] args) {
            FunctionalInterfaceExample f = String::toUpperCase;
            System.out.println(f.myMethod("abhinav"));
            f.defaultMethod();
            FunctionalInterfaceExample.staticMethod();
        }
    }
}

