class Student {

    String name;
    int age;

    Student() {

    }

    void display() {
        System.out.println("This is the name " + name);
        System.out.println("This is the age " + age);
    }
}

abstract class Animals {

    abstract void sound();
}

class Dog extends Animals {

    @Override
    void sound() {
        System.out.println("Dog Barks");
    }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Tushar";
        s1.age = 22;

        s1.display();

        Dog d = new Dog();
        d.sound();
    }
}