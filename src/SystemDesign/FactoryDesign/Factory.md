
1. The Factory Design Pattern is a creational design pattern that provides a way to create objects without specifying the exact class of the object
in the client code.
2. This pattern defines an interface or abstract class for creating an object, but allows subclasses to alter the type of objects that will be created.

we have 3 thing here.
1. Interface
2. Concrete classes which will implement Interface (Circle, Rectangle)
3. Factory class which will be responsible for creating and returning objects of Concrete classes
4. Client code without Concrete classes object