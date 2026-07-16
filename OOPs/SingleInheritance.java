package DSA_Java.OOPs;
public SingleInheritance{
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // inherited method
        d.bark();  // child class method
    }
}
}