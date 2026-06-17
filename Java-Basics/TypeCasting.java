/*
 * TypeCasting in java
 * Demonstrates Implicit (Widening) and Explicit (Narrowing)
 * Type Casting in Java.
 */

public class TypeCasting {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)(small → large data type)
        int num = 100;
        double doubleNum = num;

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer Value: " + num);
        System.out.println("Converted to Double: " + doubleNum);

        // Explicit Type Casting (Narrowing)(Large → small data type)
        double pi = 3.14159;
        int intPi = (int) pi;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double Value: " + pi);
        System.out.println("Converted to Integer: " + intPi);
    }
}