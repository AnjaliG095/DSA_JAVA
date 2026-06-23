package BitManupulation;
//Clears a bit at a specific position.
public class ClearBit {
    public static int clearBit(int num ,int position){
        int bitMask = ~(1<< position);
         return num & bitMask ;

    }
    public static void main(String[] args) {
        int result = clearBit(10,1);
        System.out.println("Updated number :"+ result);
    }
}
// It was 1010 now it beomce 1000