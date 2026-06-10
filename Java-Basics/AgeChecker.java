// Program: Check whether a person is an adult or not based on age.
// Input Example: 20
// Output Example: adult
//
// Concept: Conditional Statements (if-else)

import java.util.*;

public class AgeChecker{ 
   public static void main(String[] args) {
    
       Scanner sc= new Scanner(System.in);
       
       System.out.println("Enter age:");
       int age =sc.nextInt();

       if (age>18) {
        System.out.println("adult");
        }
        else{
            System.out.print("not adult");
       }
   }} 

