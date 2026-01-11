package Corejava;

public class StaticExample {
    static {
        System.out.println("Hi from static block");
    }

    public static class Abhinav {
        static {
            System.out.println("Hi from Inner static block");
        }

        static void print2() {
            System.out.println("Hi from static inner class static method");
        }

        void print() {
            System.out.println("Hi from static inner class non static method");
        }
    }

    public class Soumya {
        void printSoumya() {
            System.out.println("Hi from Soumya");
        }
    }

    public static void main(String[] args) {
        StaticExample.Abhinav.print2(); //Static without object creation

        Abhinav s2 = new StaticExample.Abhinav();
        s2.print();

        Soumya soumyaObj = new StaticExample().new Soumya();
        soumyaObj.printSoumya();
    }
}
