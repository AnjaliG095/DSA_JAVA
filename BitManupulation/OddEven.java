package DSA_Java.BitManupulation;

public class OddEven
{
    public static void checkOddEven(int n){
        // Important concept
        if((n&1) ==0){
            System.out.println(n+ "is even");

        }else{
            System.out.println(n + "is Odd");
        }
    }
    public static void main (String[] args){
        checkOddEven(13);
        checkOddEven(45);
    }
}