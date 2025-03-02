package Corejava;

public class SuperExample2 {
    SuperExample2(String msg) {  // No default constructor
        System.out.println("Parent constructor: " + msg);
    }
}

class Child2 extends SuperExample2 {
    Child2() {  // Compiler tries to insert super(); but Parent() doesn't exist, compile error, if you write super("Hello") as the first line it will work
        super("Hello");
        System.out.println("Child constructor");
    }
}
class SuperExample3 {
}

class Child3 extends SuperExample3 {
    Child3() {  //this works because, because If the parent class does not have a constructor at all, Java implicitly provides a default constructor (SuperExample3() {})
        System.out.println("Child constructor");
    }
}
