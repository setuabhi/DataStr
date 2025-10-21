1. The Singleton Design Pattern ensures that a class has only one instance throughout the application and
   provides a global point of access to that instance.
   This is often used to manage shared resources like configuration settings, database connections, or logging services.
2. Two main points: a) private constructor and b) public getInstance method which will return static instance
3. Problem with Lazy and Eager is that two threads call getInstance at the same time then two instances will be created
   and Singleton will break
