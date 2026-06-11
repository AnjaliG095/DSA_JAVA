// Program: Compare two numbers and determine whether the first number
// is greater than, equal to, or less than the second number.
//
// Input Example:
// Enter a: 10
// Enter b: 20
//
// Output Example:
// A is less than B
//
// Concept: Conditional Statements (if-else-if ladder)

import java.util.*;
public class ThreeCondition {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.err.println("Enter a:");
    int a = sc.nextInt();
    System.out.println("Enter b");
    int b = sc.nextInt();

    if (a>b){
        System.err.println("A is greater thatn B");
    }
    else if (a==b){
            System.err.println("equal");
        }
    else{
            System.err.println("A is less than B");
        }
    }
}

    

