**Single Responsibility Principle (SRP)**

    A class should have only one reason to change;
    Pojo shouldn't have service methods, a service class should have only similar type of features

***Java Code***

    // Violation of SRP (Contains POJO, different Service features together(
        class Invoice {
         private Date createdDate;
         void setCreatedDate(Date createdDate) this.createdDate=createdDate;
         Date getCreatedDate() return this.createdDate=createdDate;

            public void printInvoice() {
            // Logic for printing the invoice
            }
    
            public void printInvoiceOnPhoto() {
            // Logic for printing the invoice on Photo paper
            }
            
            public void saveToDatabase() {
            // Logic for saving invoice to the database
            }
        }
    
    // Applying SRP
        class Invoice {
         private Date createdDate;
         void setCreatedDate(Date createdDate) this.createdDate=createdDate;
         Date getCreatedDate() return this.createdDate=createdDate;
        }
            
        class InvoicePrinter {
            public void printInvoice(Invoice invoice) {
            // Logic for printing the invoice
            }
    
            public void printInvoiceOnPhoto() {
            // Logic for printing the invoice on Photo paper
            }
        }
        
        class InvoiceRepository {
            public void saveToDatabase(Invoice invoice) {
            // Logic for saving invoice to the database
            }
        }

**Open/Closed Principle (OCP)**

    A class should be open for extension but closed for modification.
    Do't modify existing code, extend existing code

**Java Code**

    // Violation of OCP
    public class NotificationServiceBeforeOCP {
      public void sendNotification(String type) {
        if (type.equals("Email")) {
            System.out.println("Sending email notification...");
        } else if (type.equals("SMS")) {
            System.out.println("Sending SMS notification...");
        }
        else if(type.equals("OTP"))
        {
            System.out.println("Sending OTP notification...");
        }
        else if(type.equals("CALLOTP"))
        {
            throw new RuntimeException("Wrong type");
        }
         else 
       }
      }
    
    // Applying OCP
        interface Notification {
            void send();
         }
    
        class EmailNotificatiom implements Notification {
            public void send() {System.out.println("Sending email notification...");}
         }

        class SMSNotification implements Notification {
            public void send() {System.out.println("Sending sms notification...");}
         }

        class NotificationServiceAfterOCP {
            public void sendNotification(Notification notification) {notification.send();}
         }


    //Main Class

    public class NotificationApplication {
        public static void main(String[] args) {
        NotificationServiceAfterOCP notificationServiceAfterOCP = new NotificationServiceAfterOCP();

        // Send SMS Notification
        notificationServiceAfterOCP.sendNotification(new SMSNotification());
        }
    }

**Liskov Substitution Principle (LSP)**

    Derived classes should be substitutable for their base classes, i.e. each methods in parent class should be substitutable by their Child class, else put in interface

**Java Code**

    // Violation of LSP
    Abstract class BirdWithoutLSP {
         public void fly() { System.out.println("Flying...");}
         void eat(){ System.out.println("Eating..."); }
    }
    
    class Penguin extends Bird {
         @Override
         public void fly() { throw new UnsupportedOperationException("Penguins can't fly"); }
         @Override
         public void eat() { System.out.println("Penguin Eating..."); }
    }
    
    // Applying LSP
    Abstract class BirdWithLSP {
         void eat(){ System.out.println("Eating..."); } // Only Subtituttable method present
    }
    
    interface FlyingBird{
        void fly();
    }

    interface NonFlyingBird{
        void walk();
    }
    
    class Sparrow implements FlyingBird extends BirdWithLSP {
        public void eat() { System.out.println("Sparrow eating..."); }

        public void fly() { System.out.println("Sparrow flying..."); }
    }
    
    class Penguin implements NonFlyingBird extends BirdWithLSP {
        public void eat() { System.out.println("Penguin eating..."); }
        public void walk() { System.out.println("Penguin walking..."); }
    }

**Interface Segregation Principle (ISP)**

    Clients should not be forced to depend on interfaces they do not use, Interface class should have least generic methods to override. 

**Java Code**

    // Violation of ISP
    interface Worker {
        void work();
        void eat();
    }
    
    class Robot implements Worker {
        public void work() {
        System.out.println("Robot working...");
        }
    
        public void eat() {
            throw new UnsupportedOperationException("Robots don't eat!");
        }
    }
    
    // Applying ISP while in LSV one interface is dependent on other, he we splitted completly
    interface Worker {
        void work();
    }
    
    interface Eatable {
        void eat();
    }
    
    class Human implements Worker, Eatable {
        public void work() {
        System.out.println("Human working...");
        }
        
        public void eat() {
            System.out.println("Human eating...");
        }
    }
    0
    class Robot implements Worker {
        public void work() {
        System.out.println("Robot working...");
        }
    }

**Dependency Inversion Principle (DIP)**

    High-level modules should not depend on low-level modules. Both should depend on interfaces

**Java Code Without DIP**

    class Keyboard { //low level module
         public void type() { System.out.println("Typing on keyboard..."); }
    }
    
    class Monitor { //low level module
         public void display(String message) { System.out.println("Displaying: " + message); }
    }
    
    class Computer { //high level module
        private Keyboard keyboard; // Direct dependency
        private Monitor monitor; // Direct dependency
        
            public Computer(Keyboard keyboard,Monitor monitor) {
                this.keyboard = keyboard; 
                this.monitor = monitor; 
            }
        
            public void start() {
                keyboard.type();
                monitor.display("Computer started");
            }
    }
    
    public class Main {
        public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        Computer computer = new Computer(keyboard,monitor);
        computer.start();
        }
    }

Problems:

1. The Computer class directly depends on the Keyboard and Monitor classes.
2. If we want to replace Keyboard or Monitor with a different type (e.g., GamingKeyboard, TouchscreenMonitor), we must
   modify the Computer class. This violates the Open/Closed Principle (OCP).

**Java Code DIP**

    interface InputDevice {
        void type();
    }
    
    interface OutputDevice {
        void display(String message);
    }

    class Keyboard implements InputDevice {
        public void type() { System.out.println("Typing on keyboard..."); }
    }
    
    class Monitor implements OutputDevice {
        public void display(String message) { System.out.println("Displaying: " + message); }
    }

    class Computer {
        private InputDevice inputDevice; // No Direct dependency
        private OutputDevice outputDevice; // No Direct dependency
        
            public Computer(InputDevice inputDevice, OutputDevice outputDevice) {
                this.inputDevice = inputDevice;
                this.outputDevice = outputDevice;
            }
        
            public void start() {
                inputDevice.type();
                outputDevice.display("Computer started");
            }
    }

    public class Main {
        public static void main(String[] args) {
            InputDevice keyboard = new Keyboard();
            OutputDevice monitor = new Monitor();
    
            Computer computer = new Computer(keyboard, monitor);
            computer.start();
        }
    }


