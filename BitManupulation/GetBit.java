package BitManupulation;
//Retrieves the bit value at a given position.
public class GetBit {
    public static int getBit(int num ,int postion){
        int bitMask = 1<< postion ;

        if ((num &bitMask)==0){
            return 0 ;
        }
        return 1;
    }
    public static void main (String args[]){
         System.out.println(getBit(10,2));
         System.out.println(getBit(10,1));

    }
    
}
