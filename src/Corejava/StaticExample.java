package Corejava;

public class StaticExample {
    static {
        System.out.println("Hi from static block");
    }

    public static void main(String[] args) {
        StaticExample s = new StaticExample();
        StaticExample.Abhinav.print2();

        Abhinav s2 = new StaticExample.Abhinav();
        s2.print();
        StaticExample.Abhinav.print2();

        Soumya soumyaObj = s.new Soumya();
        soumyaObj.printSoumya();
        ;
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
}
