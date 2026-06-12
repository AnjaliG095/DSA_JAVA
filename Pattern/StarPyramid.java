// Program: Print a Star Pyramid Pattern using stars.
// Input Example: 4
// Output Example:
//    *
//   * *
//  * * *
// * * * *
//
// Concept: Pattern Printing (Nested Loops)

import java.util.Scanner;
public class StarPyramid{ 
    

// right angled triangle 

    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the num of rows");
    int n = sc.nextInt();

    //outer loop row
    for(int i=1; i<=n;i++){
        // for space
        for(int j=1; j<=n-i; j++){
         System.out.print(" ");
        }
        //inner loop column 
      for(int j=1;j<=i;j++){
      System.out.print("* ");
   }
   System.out.println();
}
}
}
