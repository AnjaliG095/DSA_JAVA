package BitManupulation;
//Make the bit 1 no matter 1 or 0 it was .
public class SetBit {
    public static int  setBit(int num , int position ){
        int bitMask = 1<<position;
        return num | bitMask ;
    }
    public static void main (String[] args){
        int result = setBit (10,2);
        System.out.println("Updated Number :"+ result);
    }
    
}
// Number was 10  = 1010
// at 2 index it set means replace with 1 
// 1010 will became 1110 so Ans 14.