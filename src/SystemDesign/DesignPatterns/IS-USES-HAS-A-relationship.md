Inheritance, Association, Aggregation, Composition.


1. IS-A -> Inheritance (Dog extend Animal i.e. Dog is a animal)
2. USES-A -> Association (Dependent class doesn't present as instance variable)


      class Student { String name; }
      class Teacher {
      void teach(Student s){
         System.out.println("Teaching " + s.name); }
      }
3. Has-A (Weak) -> Aggregation


    👉 Dependent class present as instance variable and Dependent class can exist independently

    class Employee {
    String name;
    }
    
    class Company {
    List<Employee> employees;
    
        Company(List<Employee> employees) {
            this.employees = employees;
        }
    }
4. Has-A (Strong) -> Concrete -> Composition


    👉 Dependent class present as instance variable and Dependent class can't exist independently
    👉 If parent dies → child also dies 
    class Engine {
    int power;
    }
    
    class Car {
    Engine engine;
    
        Company() {
            this.engine = new Engine() ;  👉 // created inside
        }
    }1. IS-A -> Inheritance (Dog extend Animal i.e. Dog is a animal)
2. USES-A -> Association (Dependent class doesn't present as instance variable)


      class Student { String name; }
      class Teacher {
      void teach(Student s){
         System.out.println("Teaching " + s.name); }
      }
3. Has-A (Weak) -> Aggregation


    👉 Dependent class present as instance variable and Dependent class can exist independently

    class Employee {
    String name;
    }
    
    class Company {
    List<Employee> employees;
    
        Company(List<Employee> employees) {
            this.employees = employees;
        }
    }
4. Has-A (Strong) -> Concrete -> Composition


    👉 Dependent class present as instance variable and Dependent class can't exist independently
    👉 If parent dies → child also dies 
    class Engine {
    int power;
    }
    
    class Car {
    Engine engine;
    
        Company() {
            this.engine = new Engine() ;  👉 // created inside
        }
    }
