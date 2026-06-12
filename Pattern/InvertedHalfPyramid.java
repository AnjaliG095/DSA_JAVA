// Program: Print an Inverted Half Pyramid Pattern using stars.
// Input Example: 4
// Output Example:
// ****
// ***
// **
// *
//
// Concept: Pattern Printing (Nested Loops)

import java.util.Scanner;
// inverted  right angled triangle 
public class InvertedHalfPyramid{ 
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the num of rows");
    int n = sc.nextInt();

    //outer loop row
    for(int i=1; i<=n;i++){
        // for space
        for(int j=1; j<=n-i+1; j++){
         System.out.print("*");
        }
     System.out.println();
   }
  sc.close();
}
}
