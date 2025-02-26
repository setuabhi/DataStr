package Corejava;

public class StaticExample {
    static
    {
        System.out.println("Hi from static block");
    }

    public static class Abhinav{
        void print()
        {
            System.out.println("Hi from static inner class non static method");
        }
        static void print2()
        {
            System.out.println("Hi from static inner class static method");
        }
    }
}
