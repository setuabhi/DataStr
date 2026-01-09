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
        System.out.println(a.hashCode() + " " + b.hashCode()); //Arrays objects mutable example

        Integer a1 = 2;
        System.out.println(a1.hashCode());
        a1 = 4;
        System.out.println(a1.hashCode()); //Non Primitive Immutable example, changing value changed address

        String aa = "Abhinav";
        String bb = "Abhinav";
        String cc = "Abhinavv";
        System.out.println(aa.hashCode() + " " + bb.hashCode() + " " + cc.hashCode()); //String constant pool example aa and bb points to same memory
        aa = "ABhi";
        System.out.println(aa.hashCode()); //String Immutable example, changing value changed address

        String newAA= new String("Abhi");
        String newAB= new String("Abhi");
        System.out.println(newAA.hashCode()+" "+newAB.hashCode()); // same as they point to same Heap.

        //Primitive stored directly in stack memory and non-primitive we assign memory in heap

        Practice practice = new Practice(2);
        Practice practice2 = new Practice(3);
        System.out.println(practice.hashCode() + " " + practice2.hashCode());
        practice=practice2;//If you make non primitive equal and both will point to same memory, changing one will change another
        System.out.println(practice.hashCode() + " " + practice2.hashCode());
        practice.x=100;
        System.out.println(practice.hashCode() + " " + practice2.hashCode());

    }
}
