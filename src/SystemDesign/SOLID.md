**Single Responsibility Principle (SRP)**

    A class should have only one reason to change; a service class should have only similar type of features

***Java Code***

    // Violation of SRP
        class Invoice {
            public void calculateTotal() {
            // Logic for total calculation
            }
    
    
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
            public void calculateTotal() {
            // Logic for total calculation
            }
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

**Java Code**

    // Violation of OCP
        class DiscountService {
            public double applyDiscount(String type, double amount) {
            if ("FESTIVAL".equals(type)) {
            return amount * 0.9; // 10% off
            } else if ("SEASONAL".equals(type)) {
            return amount * 0.8; // 20% off
            }
             throw new RuntimeException("Discount can't be applied");
            }
        }
    
    // Applying OCP
        interface Discount {
            double apply(double amount);
        }
    
        class FestivalDiscount implements Discount {
            public double apply(double amount) {
            return amount * 0.9; // 10% off
            }
        }
    
        class SeasonalDiscount implements Discount {
            public double apply(double amount) {
            return amount * 0.8; // 20% off
            }
        }
        
        class DiscountService {
            public double applyDiscount(Discount discount, double amount) {
            return discount.apply(amount);
            }
        }

    //Main Class

    public class DiscountApplication {
        public static void main(String[] args) {
        DiscountService discountService = new DiscountService();

        // Use SeasonalDiscount
        Discount seasonalDiscount = new SeasonalDiscount();
        double originalAmount = 1000.0;
        double discountedAmount = discountService.applyDiscount(seasonalDiscount, originalAmount);

        System.out.println("Original Amount: $" + originalAmount);
        System.out.println("Discounted Amount (Seasonal): $" + discountedAmount);
        }
    }

**Liskov Substitution Principle (LSP)**

    Derived classes should be substitutable for their base classes, i.e. each methods in parent class should be substitutable by their Child class

**Java Code**

    // Violation of LSP
    class Bird {
        public void fly() {
        System.out.println("Flying...");
        }
        void eat(){
        System.out.println("Eating...");
        }
    }
    
    class Penguin extends Bird {
        //LSV fails as fly method is not substitutable
    }
    
    // Applying LSP
    interface Bird {
     void eat();
    }
    
    interface FlyingBird extends Bird {
        void fly();
    }
    
    class Sparrow implements FlyingBird {
        public void eat() {
        System.out.println("Sparrow eating...");
        }
        
        public void fly() {
            System.out.println("Sparrow flying...");
        }
    }
    
    class Penguin implements Bird {
        public void eat() {
        System.out.println("Penguin eating...");
        }
    }


**Interface Segregation Principle (ISP)**

    Clients should not be forced to depend on interfaces they do not use, Interface class should have least generic methods to override. while in Liscov we don't force as it was a class but there also all methods should be substitutable 

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
    interface Workable {
        void work();
    }
    
    interface Eatable {
        void eat();
    }
    
    class Human implements Workable, Eatable {
        public void work() {
        System.out.println("Human working...");
        }
        
        public void eat() {
            System.out.println("Human eating...");
        }
    }
    0
    class Robot implements Workable {
        public void work() {
        System.out.println("Robot working...");
        }
    }

**Dependency Inversion Principle (DIP)**

    High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces).

**Java Code Without DIP**

    class Keyboard {
        public void type() {
        System.out.println("Typing on keyboard...");
        }
    }
    
    class Monitor {
        public void display(String message) {
        System.out.println("Displaying: " + message);
        }
    }
    
    class Computer {
        private Keyboard keyboard;
        private Monitor monitor;
        
            public Computer() {
                this.keyboard = new Keyboard(); // Direct dependency
                this.monitor = new Monitor();   // Direct dependency
            }
        
            public void start() {
                keyboard.type();
                monitor.display("Computer started");
            }
    }
    
    public class Main {
        public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        }
    }

Problems:
1. The Computer class directly depends on the Keyboard and Monitor classes.
2. If we want to replace Keyboard or Monitor with a different type (e.g., GamingKeyboard, TouchscreenMonitor), we must modify the Computer class. This violates the Open/Closed Principle (OCP).

**Java Code DIP**

    interface InputDevice {
        void type();
    }
    
    interface OutputDevice {
        void display(String message);
    }

    class Keyboard implements InputDevice {
        public void type() {
        System.out.println("Typing on keyboard...");
        }
    }
    
    class Monitor implements OutputDevice {
        public void display(String message) {
        System.out.println("Displaying: " + message);
        }
    }

    class Computer {
        private InputDevice inputDevice;
        private OutputDevice outputDevice;
        
            public Computer(InputDevice inputDevice, OutputDevice outputDevice) {
                this.inputDevice = inputDevice; // Depends on abstractions, not concrete classes
                this.outputDevice = outputDevice; // Depends on abstractions, not concrete classes
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
    

**Summary**

    Only for S the solution is create new classes 
    for O, I and D solution is use interface instead of class
    and for L = split Interfaces to least generic

