package OOPS;

/*
 * Inheritance:
 * Inheritance allows one class to acquire the properties
 * and methods of another class.
 *
 * Parent Class (Base Class):
 * The class whose properties are inherited.
 *
 * Child Class (Derived Class):
 * The class that inherits properties from the parent class.
 *
 * Keyword Used:
 * extends
 */

// PARENT CLASS

class Animal {

    void eat() {
        System.out.println("Animal can eat");
    }
}

// CHILD CLASS
// Dog inherits Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog can bark");
    }
}

public class Inheritance {

    public static void main(String[] args) {

        // Creating object of child class
        Dog d1 = new Dog();

        // Method inherited from Animal class
        d1.eat();

        // Method of Dog class
        d1.bark();
    }
}

/*
Output:
Animal can eat
Dog can bark
*/