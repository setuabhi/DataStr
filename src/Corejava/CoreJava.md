1.**File name questions:**

    🔴 In Java, you can only have one public class per source file, and the name of the source file must match the name of the public class. However, you can have
    multiple non-public classes in a single file.

    🔴 It is mandatory to make the public class name and file name the same in Java because the Java compiler uses the file name 
    to determine the name of the public class defined in the file.

2.**Main Method questions:**

    🔴 we can overload main but can't override because it's static (Static method becomes class property)

    🔴 If you don't call the overloaded main methods explicitly, only the standard main(String[] args) will execute, because that's the entry point for the JVM.

    🔴 If we pass program argument as "hello world" 123 then args[0] = "hello world" and args[1] = "123".

    🔴 -Denv=production passed in VM argument then String env = System.getProperty("env");

3.**Java Pass by value or pass by reference, for primitive it's pass by value and non-primitive it's pass by reference**

4.**Protected keyword Access in a subclass (even outside the package) is allowed.**

5.**Static Keyword questions:**

    🔴 static block will always execute when class object created

    🔴 We can't make main class static, only inner class can be static

    🔴 Can't override static method, can't extend static inner class

    🔴 create object of inner static class(Abhinav) as: StaticExample.Abhinav s2= new StaticExample.Abhinav();

6.**Final Keyword questions:**

    🔴 With variable:
       1️ A final variable can be assigned only once. Once assigned, its value cannot be changed.

       2️ Final Reference Variable:
            final StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");  // Allowed (modifying the object)
            sb = new StringBuilder("New"); // Compilation error (cannot reassign)️

    🔴 A final method cannot be overridden by subclasses.

    🔴 A final class cannot be extended (no subclass can be created).

7.**Assert keyword:**

    🔴 Used for debugging purpose, in vm argument pass -ea:com.myapp (in com.myapp package assert will be enabled)

    🔴 int x = -1;
       assert x > 0 : "x must be positive!"; //Exception in thread "main" java.lang.AssertionError: x must be positive!

8.**instanceOf keyword:**

    🔴 to check whether object is instance of Class or not

    🔴 Parent obj = new Child();
        System.out.println(obj instanceof Parent); // true
        System.out.println(obj instanceof Child);  // true

9.**Transient keyword:**

    🔴 When an object is serialized, all its fields (including private ones) are by default included in the serialized output. 
       However, some fields might contain sensitive information (e.g., passwords) or data that is irrelevant for serialization (e.g., cached values or database connections). Marking these fields as transient ensures that they are not saved and do not become part of the serialized object.

    🔴  User user = new User("john_doe", "secure123");
        // Serialize object 
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser")); //user.ser is a file that stores the serialized object in binary format.
        oos.writeObject(user);
        oos.close();
        
        // Deserialize object
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
        User deserializedUser = (User) ois.readObject();
        ois.close();
        
        // Output
        System.out.println("Deserialized User: " + deserializedUser.password); //null

10.**Memory allocation:**

    🔴 Local variables: Inside a method, constructor, or block  ; Instance variables: Inside a class, outside any method

    🔴 Stack Memory – Stores local variables and method calls, Each method gets a new stack frame when it is called , Cleaned When method ends
       Heap Memory – Stores objects and instance variables, cleaned By Garbage Collector
       String Constant Pool (SCP) – A special part of the heap where string literals are stored. cleaned By Garbage Collector
     
    🔴  class Person {
        String name; // Stored in heap
        }
        
        public class HeapExample {

        public static void main(String[] args) {
        String s="Java";
        Person p1 = new Person(); // Object stored in heap, reference in stack
        p1.name = "Alice";
            }
        }

    Stack:
    | main() Frame   |
    | p1 (reference) |
    -----------------
    Heap:
    | Person Object  |
    | name = "Alice" |
    ----------------
    SCP:
    | "Java" (one object) |

11.**String questions:**