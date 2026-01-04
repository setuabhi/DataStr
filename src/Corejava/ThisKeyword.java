package Corejava;

public class ThisKeyword {
    String name; //Instance Variable
    int age;

    ThisKeyword() {
        this("John", 30); // Calling the parameterized constructor
    }

    ThisKeyword(String name, int age) {
        this.name = name;
        this.age = age;
    }
    class Inner {
        void display() {
            ThisKeyword.this.show(); // Referring to outer class method from Inner
        }
    }

    public static void main(String[] args) {
        ThisKeyword outer = new ThisKeyword();
        ThisKeyword.Inner inner = outer.new Inner();
        inner.display();
    }

    ThisKeyword getInstance() {
        return this; //Return Current Instance
    }

    void show() {
        System.out.println("Outer class method");
    }

}
