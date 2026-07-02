package DSA_Java.OOPs;
/*
 * Demonstrates creation of a class and object.
 */

class Stu {
 // Instance Variables
    String name;
    int age;
// Method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ClassesAndObjects {

    public static void main(String[] args) {
// Creating object of student class;
        Student s1 = new Student();

        s1.name = "Anjali";
        s1.age = 20;

        s1.display();
    }
}

/*
Output:
Name: Anjali
Age: 20
*/