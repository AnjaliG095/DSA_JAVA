package OOPS;



abstract class Animal {

    abstract void eat();

}

class Deer extends Animal {

    @Override
    void eat() {
        System.out.println("Eats grass");
    }

}

public class AbstractionDemo {

    public static void main(String[] args) {

        Deer d = new Deer();
        d.eat();

    }

}
    

