package DSA_Java.BitManupulation;

public class UpdateBit {
    public static int updateBit(int num , int position ,int newBit){
        num = num & (~(1 << position));
        int bitMask = newBit << position;
        return num | bitMask ;
    }
public static void main(String[] args) {
    System.out.println(updateBit(10,1,1));
    System.out.println(updateBit(10,3,0));
}
    
}
// It was 1010 then it Update to 1010 only 
// 2nd case 1010 it was after update its 3 value will update to 0 os it will become 0010 = 2.
