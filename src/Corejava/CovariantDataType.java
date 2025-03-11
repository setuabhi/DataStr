/**
 * AbstractClassWithConstructorAndInstanceVariable
 */
package Corejava;

/**
 * Covariant return type is a feature introduced in Java 5 that allows a method to override a parent method while returning a more specific (subtype) object instead of the parent class type. This improves code flexibility and reduces the need for explicit type casting.
 * Not applicable for primitive data types
 */
public class CovariantDataType {
    CovariantDataType get() {
        return this;
    }
    Number getNumber() {
        return 10.7; // int auto-boxed to Integer
    }

}
class ChildCovarient extends CovariantDataType {
    @Override
    ChildCovarient get() { // Covariant return type (returning a subtype)
        return this;
    }

    @Override
    Double getNumber() {
        System.out.println(10.5);// ✅ Valid covariant return type
        return 10.5;
    }

    void showChild() {
        System.out.println("Child method");
    }
}
class CovariantDemo {
    public static void main(String[] args) {
        ChildCovarient c = new ChildCovarient();
        c.get().showChild(); // No explicit casting needed
        c.getNumber(); // No explicit casting needed
    }
}
