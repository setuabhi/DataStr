1. The Singleton Design Pattern ensures that a class has only one instance throughout the application and provides a global point of access to that instance.
   Some classes represent shared resources. Creating multiple instances leads to bugs. Examples:
   Database connection manager
   Logger
   Cache manager
   Thread pool
   EmailService 
2. Two main points: a) private constructor and b) public static getInstance method which will return static instance
