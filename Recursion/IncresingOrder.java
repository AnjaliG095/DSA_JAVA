

public class IncresingOrder {
   public static void IncNumber(int n){
    if(n==1){
        System.out.println(n);
        return  ;
    }
    IncNumber(n-1);//recursive call 
    System.out.println(n+" ");
     
}  
public static void main(String[] args) {
    int n =10;
    IncNumber(n);
}
}
