import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("press1/2/3:");
    int button= sc.nextInt();
    

switch(button) {
    case 1:System.err.println("hello");
    break;
    case 2: System.err.println("nasmaste");
    break;
    case 3 :System.out.println("Ram ram");
    break;
    default: System.out.println("invalid");

}
}
}
