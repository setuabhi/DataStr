package Corejava;

import java.util.List;

//Generic class , T comes after class name
public class GenericExample<T> {
    private T value;

    // Generic static method, T comes before return type
    public static <T> void printList(List<T> list) {
        for (T item : list) {  // ✅ You know T, so you can safely access it
            System.out.println(item);
        }
    }

    // Wildcard method
    public static void printListWildcard(List<?> list) {  // `?` means unknown type
        for (Object item : list) {  // ✅ We only assume it's an Object
            System.out.println(item);
        }
    }

    public static void printListWildcardFixed(List<? extends Number> list) {  // `?` means unknown type
        for (Number item : list) {  // ✅ We know it's a Number
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        GenericExample<String> stringBox = new GenericExample<>();
        stringBox.setValue("Hello, Generics!");
        System.out.println(stringBox.getValue()); // Output: Hello, Generics!

        GenericExample<Integer> intBox = new GenericExample<>();
        intBox.setValue(42);
        System.out.println(intBox.getValue()); // Output: 42

        String[] strArray = {"Apple", "Banana", "Cherry"};
        Integer[] intArray = {1, 2, 3};

    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

/**
 * control type too
 * Only accepts Number or its subclasses
 */
class Calculator<T extends Number> {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println(intCalc.square(5));  // Output: 25.0

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println(doubleCalc.square(3.14));  // Output: 9.8596
    }

    public double square(T number) {
        return number.doubleValue() * number.doubleValue();
    }
}
