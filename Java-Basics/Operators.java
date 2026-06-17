/*
 * Operators.java
 * Demonstrates different types of operators in Java:
 * Arithmetic, Relational, Logical, and Assignment Operators.
 */

public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators:");
        System.out.println((a > b) && (b > 0));
        System.out.println((a < b) || (b > 0));
        System.out.println(!(a < b));

        // Assignment Operators
        System.out.println("\nAssignment Operators:");
        int c = 20;
        c += 10;
        System.out.println("c += 10 : " + c);

        c -= 5;
        System.out.println("c -= 5 : " + c);
    }
}