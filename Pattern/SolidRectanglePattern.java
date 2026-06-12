// Program: Print a Solid Rectangle Pattern using stars.
// Output Example:
// ******
// ******
// ******
// ******
// ******
//
// Concept: Pattern Printing (Nested Loops)

public class SolidRectanglePattern{ 
    
    public static void main(String[] args) {
         //rows: Outer loop
        for (int i = 0; i <= 4; i++) {
            //columns : inner loop
            for (int j = 0;j <= 5; j++) {
            System.out.print("*");
            }
            System.out.println("");
}          
}
}
