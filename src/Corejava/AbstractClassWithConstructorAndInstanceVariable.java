package Corejava;

public abstract class AbstractClassWithConstructorAndInstanceVariable {

    String name;
    AbstractClassWithConstructorAndInstanceVariable(String name) //Abstract class constructor
    {
        this.name=name;
    }

    abstract void doSomething();
}

class child extends AbstractClassWithConstructorAndInstanceVariable{

    child(String name) {
        super(name);
    }

    @Override
    void doSomething() {
        System.out.println(super.name +" Running");
    }


    public static void main(String[] args) {
        AbstractClassWithConstructorAndInstanceVariable obj= new child("Abhinav");
        obj.doSomething();
    }
}
