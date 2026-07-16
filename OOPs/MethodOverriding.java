package OOPS;

public class MethodOverriding {
    public static void main(String[] args) {
    Deer d = new Deer();
    d.eat();// will call only child class bcz it overrides the parent one .
}
}
class Anima{
    void eat(){ 
        System.out.println("Eats");
    }

}
class Deer extends Anima{
    void eat(){
    System.out.println("eats grass");
}
}
