package Java8;

/**
 * Introduced to have backward compatibility
 * contains exactly one abstract method.
 */
@FunctionalInterface // Although not required, it is a good practice to use
public interface FunctionalInterfaceExample {
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    Integer myMethod(int a, int b);

    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    public class testMain {
        public static void main(String[] args) {
          FunctionalInterfaceExample comapreTwo= (input1,input2)->{
              return Math.max(input1,input2);
          }; // if(input1>input2) return input1; else return input2; is return type,
            // input1,input2 is argument
            System.out.println(comapreTwo.myMethod(5,7));
            comapreTwo.defaultMethod();
            FunctionalInterfaceExample.staticMethod();
        }
    }
}

