package JavMemory;

public class MemoryExample {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = new int[a.length];
        System.out.println(a.hashCode() + " " + b.hashCode());
        b = a;
        System.out.println(a.hashCode() + " " + b.hashCode()); //Point to same memory
        a[0] = 7;
        a[1] = 8;
        System.out.println(a.hashCode() + " " + b.hashCode()); //Primitive data type mutable example

        Integer a1 = 2;
        System.out.println(a1.hashCode());
        a1 = 4;
        System.out.println(a1.hashCode()); //Immutable example, changing value changed address

        String aa = "Abhinav";
        String bb = "Abhinav";
        String cc = "Abhinavv";
        System.out.println(aa.hashCode() + " " + bb.hashCode() + " " + cc.hashCode()); //String constant pool example
        aa = "ABhi";
        System.out.println(aa.hashCode()); //String Immutable example, changing value changed address

        //Primitve stored directly in memory and non primitive we assign memory

        Practice practice = new Practice();
        Practice practice2 = new Practice();
        practice2 = practice; //If you make non primitive equal and both will point to same memory, changing one will change another

        System.out.println(practice.hashCode() + " " + practice2.hashCode());
        //  System.out.println(practice.a+" "+practice2.a);

    }
}
