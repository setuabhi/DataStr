1. In Java, a functional interface is an interface that contains exactly one abstract method. This single abstract method defines the functionality that can be implemented by a lambda expression 
2. Optional @FunctionalInterface Annotation: While not mandatory, the @FunctionalInterface annotation is often used to explicitly declare an interface as a functional interface. This helps the compiler catch errors if the interface accidentally violates the single abstract method rule.
3. A functional interface can have any number of default or static methods in addition to the single abstract method.
4. Java provides several built-in functional interfaces in the java.util.function package, such as:

       Predicate: Represents a boolean-valued function of one argument. 
       Consumer: Represents an operation that accepts a single input argument and returns no result.
       Function: Represents a function that accepts one argument and produces a result. 
       Supplier: Represents a supplier of results.