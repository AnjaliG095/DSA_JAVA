package DSA_Java.OOPs;
f
/*
 *
 * Constructor:
 * A constructor is a special method that is automatically called
 * when an object is created.
*/

class Student {

    String name;
    int age;

   
    // CONSTRUCTOR DEFINITION
    
    Student(String name, int age) {

        // 'this' refers to the current object
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Constructors {

    public static void main(String[] args) {

       
        // CONSTRUCTOR CALL / USAGE
        Student s1 = new Student("Anjali", 20);

        // Displaying object data
        s1.display();
    }
}

/*
Output:
Name: Anjali
Age: 20
*/