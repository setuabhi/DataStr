package Corejava;

public class MainClass {
    public static void main(String[] args) {
        StaticExample s =new StaticExample();
        StaticExample.Abhinav.print2();
        StaticExample.Abhinav s2= new StaticExample.Abhinav();
        s2.print();
    }
}
