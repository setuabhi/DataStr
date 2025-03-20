package Corejava;

//Generic class , T comes after class name
public class GenericExample <T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    // Generic method, T comes before return type
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
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

        printArray(strArray); // Output: Apple Banana Cherry
        printArray(intArray); // Output: 1 2 3
    }
}

/** control type too
*  Only accepts Number or its subclasses
*/
class Calculator<T extends Number> {
    public double square(T number) {
        return number.doubleValue() * number.doubleValue();
    }

    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>();
        System.out.println(intCalc.square(5));  // Output: 25.0

        Calculator<Double> doubleCalc = new Calculator<>();
        System.out.println(doubleCalc.square(3.14));  // Output: 9.8596
    }
}
