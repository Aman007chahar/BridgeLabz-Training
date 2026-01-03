package inheritance;

public class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;

    void displayRole() {
        System.out.println("Teacher");
    }
}
class Student extends Person {
    String grade;

    void displayRole() {
        System.out.println("Student");
    }
}
