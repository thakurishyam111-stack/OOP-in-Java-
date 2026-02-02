
// the concept of using the proparty of parentes class by  a child class is  called inheritence
//
// parant class allso called super class and child  class is also called dirived class 
//key word "extends " is used to inheritence the super class
// public class level {
//     public static void main(String[] args) {

//          class  Animals{
//            int  eye=2;
//            int tail=1;

//         }
//         class Dog extends Animals{
//         String breed;
//         String name;

//         }

//         class GS extends Animals{
//             String color;
//         }

//     System.out.println(Animals.tail);
// }
// }
// type of inheritance 

//1 single inheritance

// In this type, one child class inherits from a single parent class. This is 
// the simplest form of inheritance, enabling code reusability between two related classes.
//  Example: class Dog extends Animal {}

//2 multilevel

//  A class inherits from a class which is also inherited from another class, forming an inheritance chain.
//  The class at the bottom of the chain can access features of all classes above it in the hierarchy.
// Example: class BabyDog extends Dog extends Animal {}

//   3 multiple

// A single class attempts to inherit from more than one class. Java does not support this with
//  classes due to potential ambiguity issues (the "diamond problem"). However, this can be achieved
//  by a class implementing multiple interfaces.
// Example (using interfaces): class Person implements Moveable, Speakable {}

//  4 hybride

// This is a combination of two or more types of inheritance. Like multiple inheritance, it is not
//  supported with classes in Java, but can be implemented using a mix of classes and interfaces. 
// 

//   Abstraction
//the abstraction can't creat obj

// the concept of hideing is called abstraction.
// the key word (abstract) is used in abstraction.
// for ex #

// abstract class A {
//     abstract void add(); // for hide code

//     abstract void sum(); // for hide code

//     class C extends A {
//          @Override
//         void add() {

//             System.out.println("hello");
//         }
//  @Override
//         void sum() {
//             System.out.println("hiii ");
//         }

//     }
// }

// public class D {
//     public static void main(String[] args) {
//        A a1 = new C ();
//         a1.add();
//         a1.sum();
//     }

// }

// abstract class TV{

//     abstract void turnOn();
//     abstract void turnOff();
// }

// // Concrete class implementing the abstract methods
// class TVRemote extends TV{

//     void turnOn(){

//         System.out.println("TV is turned ON.");
//     }

//     void turnOff(){

//         System.out.println("TV is turned OFF.");
//     }
// }

// // Main class to demonstrate abstraction
// public class Geeks{

//     public static void main(String[] args){

//         TV a = new TVRemote();
//         a.turnOn();   
//         a.turnOff();  
//     }
// }
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}