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

    🔴 create object of inner static class(Abhinav) as:
            StaticExample.Abhinav s2= new StaticExample.Abhinav();
            See we can create object of inner non static class
    🔴 Access non static variable from static method:
        class Example {
            int instanceVariable = 10; // Non-static variable
        
            static void staticMethod() {
                Example obj = new Example(); // Create an instance
                System.out.println("Instance Variable: " + obj.instanceVariable);
            }
        }

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
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.txt")); //user.txt is a file that stores the serialized object in binary format.
        oos.writeObject(user);
        oos.close();
        
        // Deserialize object
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.txt"));
        User deserializedUser = (User) ois.readObject();
        ois.close();
        
        // Output
        System.out.println("Deserialized User: " + deserializedUser.password); // password null

10.**Memory allocation:**

    🔴 Local variables: Inside a method, constructor, or block  ; Instance variables: Inside a class, outside any method

    🔴 Stack Memory – Stores local variables and method calls, Each method gets a new stack frame when it is called , Cleaned When method ends
       Heap Memory –  Stores objects and instance variables, cleaned By Garbage Collector
       String Constant Pool (SCP) – A special part of the heap where string literals are stored. cleaned By Garbage Collector
     
    🔴  class Person {
        String name; // Stored in heap
        }
        
        public class HeapExample {

        public static void main(String[] args) {
        String s="Java";
        Person p1 = new Person(); 
        p1.name = "Alice";
            }
        }

    Stack:
    | main() Frame   |
    | s              |
    | p1 (reference) |
    -----------------
    Heap:
    | Person Object  |
    | name = "Alice" |
    ----------------
    SCP:
    | "Java" (one object) |

11.**String questions:**

    🔴  String (Immutable)
            A String in Java is immutable, meaning once it is created, it cannot be changed.
            Every modification creates a new object in memory.
            Stored in the String Constant Pool (SCP) for optimization.
        Code:
            String s1 = "Hello";           // Stored in SCP
            String s2 = s1 + "World";     // New object created in heap, The + operator triggers StringBuilder concatenation at runtime, that's why heap came in picture
            String s3 = (s1 + "Abhi").intern();

            SCP:
            | "Hello"        |
            | " World"       |
            | " Hello Abhi" |
            
            Heap:
            | "Hello World" (created at runtime) |
    
            Stack:
            | s1 ->Pointing to SCP |
            | s2 ->Pointing to Heap|
            | s3 ->Pointing to SCP |

    🔴  StringBuffer (Mutable & Thread-Safe)

    🔴  StringBuilder (Mutable & Faster beacause it's not tread safe i.e. it does not have synchronization overhead.)

    🔴  String s1 = new String("abhi"); //Below things will happen
            SCP:
            | "abhi" |  <-- Created if not already present
            
            Heap:
            | "abhi" (New object from `new String()`) |

            Stack:
            | s1 ->Pointing to Heap |

    🔴  String s1 = new String("abhi");  // Heap object
        String s2 = "abhi";              // SCP object
        String s3 = "abhi";             // SCP object
        String s4 = new String("abhi").intern();         // s4 points to SCP object
    
        System.out.println(s1 == s2); // false (heap vs SCP)
        System.out.println(s2 == s3); // true (both in SCP)
        System.out.println(s2 == s4); // true (both in SCP)
        System.out.println(s1 == s4); // false (heap vs SCP)

12.**Bitwise operator**

    🔴  Divide the number by 2 and write down the quotient and remainder.
        Divide the quotient by 2 and write down the quotient and remainder.
        Repeat the process until the quotient becomes 0.
        Read the remainders from bottom to top to get the binary representation
    🔴  AND operator: "&" returns a value with 1s only where both operands have 1s,and 0s elsewhere.
        OR operator: "|" returns a value with 1s where either or both operands have 1s, and 0s elsewhere.
        XOR operator: "^" returns a value with 1s only where the operands have different values, and 0s if same.
        3 | 5 will return 7, we need to convert 3 and 5 to binary
        3^3 will return 0, beacuse all binary will be same for both numbers
        3^0 will return 3, think 
        3^7 will return 4, we need to convert 3 and 4 to binary