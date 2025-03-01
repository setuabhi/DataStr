package Corejava;

public class superExample {

    int x;
    superExample() {
        System.out.println("Parent class constructor");
    }
    void show() {
        System.out.println("Parent class method");
    }
    static void staticParent()
    {
        System.out.println("staticParent method");
    }
}

class Child extends superExample {

    Child() {
        super();  // Calls the parent class constructor, no need of this btw, as  Java automatically inserts super(); as the first line.
        System.out.println("Child class constructor");
    }
    void show() {
        super.show();  // Calls the parent class method, always first statement
        System.out.println("Child class method"+ super.x); //Access parent variable
    }

    static void staticChild()
    {
     //   super.staticParent();  ❌ This will cause a compilation error bcoz super keyword CANNOT be used to access static methods because static methods belong to the class, not an instance.
          superExample.staticParent();   // ✅ Use class name instead
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}

