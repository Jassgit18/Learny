class QA{
    String question;
    String answer;

    QA(String q,String a){
        question=q;
        answer=a;
    }
}

public class QuestionBank {
    // COREJAVA Repeated Interview QNs
    public QA[] getJavaCommon(){
       return new QA[]{
              new QA("What is Java and why is it platform independent?",
                     "Java is a programming language that runs on any OS because it compiles into bytecode, which is executed by the JVM on every platform."),
              new QA("Difference between JDK, JRE, and JVM",
                     "JVM → runs bytecode,JRE → JVM + libraries to run programs,JDK → JRE + tools to develop programs."),
              new QA("What is a class and object?",
                     "Class → blueprint,Object → real instance of that class"),
              new QA("What is a constructor?",
                     "A constructor initializes an object when it is created."),
              new QA("Difference between == and equals()", 
                     "== → compares references\n \nequals() → compares content"),
              new QA("What is method overloading?",
                     "Same method name, different parameters, in the same class."),
              new QA("What is method overriding?",
                     "Subclass provides a new implementation of a parent class method."),
              new QA("Difference between String, StringBuilder, StringBuffer", 
                     "String → immutable\n StringBuilder → mutable, not synchronized\n StringBuffer → mutable, synchronized"),
              new QA("What is static keyword?",
                     "Belongs to the class, not to objects."),
              new QA("What is final keyword?",
                     "Prevents change:final variable → cannot change\n,final method → cannot override\n,final class → cannot inherit"),
              new QA("What is exception handling?",
                     "Handling runtime errors using try, catch, finally."),
              new QA("Difference between checked and unchecked exceptions",
                     "Checked → compile-time (IOException),Unchecked → runtime (NullPointerException)"),
              new QA("What is garbage collection?",
                     "Automatic removal of unused objects from memory."),
              new QA("What is multithreading?",
                     "Executing multiple threads at the same time for better performance.")
              };
       }

    // OOPS Repeated Interview QNs
     public QA[] getOopsCommon() {
       return new QA[] {

        new QA("What is OOP?",
               "OOP is a programming approach based on objects instead of functions."),

        new QA("What are the four pillars of OOP?",
               "Encapsulation, Inheritance, Polymorphism, and Abstraction."),

        new QA("What is encapsulation?",
               "Encapsulation wraps data and methods into a single unit and hides data using access modifiers."),

        new QA("What is inheritance?",
               "Inheritance allows one class to acquire the properties of another class."),

        new QA("What is polymorphism?",
               "Polymorphism allows one method to behave in different ways based on the object."),

        new QA("What is abstraction?",
               "Abstraction hides implementation details and shows only essential features."),

        new QA("Difference between abstract class and interface?",
               "An abstract class can have method implementations, but an interface provides only method declarations and supports multiple inheritance."),

        new QA("What is method overriding?",
               "Method overriding occurs when a subclass provides a specific implementation of a parent class method."),

        new QA("What is constructor chaining?",
               "Constructor chaining means calling one constructor from another using this() or super()."),

        new QA("What is dynamic binding?",
               "Dynamic binding means method calls are resolved at runtime instead of compile time."),

        new QA("What is this keyword?",
               "The this keyword refers to the current object of the class."),

        new QA("What is super keyword?",
               "The super keyword refers to the parent class object and is used to access parent class members."),

        new QA("What is multiple inheritance in Java?",
               "Java does not support multiple inheritance using classes, but it supports it using interfaces."),

        new QA("What is object cloning?",
               "Object cloning creates an exact copy of an object using the clone() method."),

        new QA("What is SOLID principle?",
               "SOLID is a set of five design principles: Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, and Dependency Inversion.")
       };
}


    // LEVELS COREJAVA QNs
    public QA[] getEasyQns(){
        return new QA[]{
              new QA("What is JVM?",
                   "JVM is a Java Virtual Machine that execute the java bytecode."),
              new QA("What is Java?", 
                   "Java is a high level, platform independent and object oriented programming language that is used to develop software ,web and mobile applications"),
              new QA("What is JDK?",
                   "JDK is a Java Development Kit, which is a software development kit,that provides all the tools for develop, run,compile applications.It consist of JRE, JVM. java compiler and other tools."),
              new QA("What is a class?", 
                   "Class is a blueprint or a template that consist of properties and behaviour of an object"),
              new QA("What is a constructor?",
                   "A constructor initializes an object when it is created."),
              new QA("What is inheritance?",
                   "Inheritance allows a class to acquire properties of another class."),
              new QA("What is StringBuilder?",
                   "StringBuilder is a mutable class used for modifying strings."),
              };
       }

       public QA[] getMediumQns(){
        return new QA[]{
              new QA("Difference between JDK and JRE?", 
                   "JDK is for development purporse, while JRE is for running java programs."),
              new QA("What is polymorphism?",
                   "Polymorphism allows one method to behave in different ways."),
              new QA("What is abstraction?",
                   "Abstraction hides implementation details and shows only essential features."),
              new QA("Difference between StringBuilder and StringBuffer?",
                   "StringBuilder is not synchronized, StringBuffer is synchronized."),
              new QA("What is thread safety?",
                   "Thread safety means data is accessed safely by multiple threads."),
              new QA("What is an exception?",
                   "An exception is a runtime error that disrupts normal program flow.")
             };
       }

       public QA[] getHardQns() {
        return new QA[] {
              new QA("What is JVM JIT compiler?",
                   "JIT converts frequently used bytecode into native machine code at runtime."),
              new QA("Explain deadlock.",
                   "Deadlock occurs when two threads wait forever for each other’s resources."),
              new QA("What is synchronization?",
                   "Synchronization controls thread access to shared resources."),
              new QA("Explain memory leak in Java.",
                   "Memory leak happens when objects are not released from memory."),
              new QA("What is garbage collection?",
                   "Garbage collection automatically frees unused objects from memory.")
              };
       }
}
