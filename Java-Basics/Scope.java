/*
 * Scope in java
 * Demonstrates the concept of variable scope in Java.
 * Local variables can only be accessed within the method they are declared in.
 * Class variables can be accessed throughout the class.
 */

public class Scope {

    // Class (Global) Variable
    static int globalVar = 100;

    public static void display() {
        int localVar = 50; // Local Variable

        System.out.println("Local Variable: " + localVar);
        System.out.println("Global Variable: " + globalVar);
    }

    public static void main(String[] args) {

        display();

        // localVar cannot be accessed here
        // System.out.println(localVar); // Error

        System.out.println("Global Variable from Main: " + globalVar);
    }
}