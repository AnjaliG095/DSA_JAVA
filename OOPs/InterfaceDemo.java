package OOPS;

interface Animal {

    void eat();

}

class Deer implements Animal {

    @Override
    public void eat() {
        System.out.println("Eats grass");
    }

}

public class InterfaceDemo {

    public static void main(String[] args) {

        Deer d = new Deer();
        d.eat();

    }

}