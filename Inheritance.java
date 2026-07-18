// Inheritance.java

// Parent class (Superclass)
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class (Subclass)
class Dog extends Animal {
    Dog(String name) {
        super(name); // calls parent constructor
    }

    void bark() {
        System.out.println(name + " is barking.");
    }

    // Method overriding
    @Override
    void eat() {
        System.out.println(name + " (a dog) is eating dog food.");
    }
}

// Another child class to show more inheritance
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void meow() {
        System.out.println(name + " is meowing.");
    }

    @Override
    void eat() {
        System.out.println(name + " (a cat) is eating cat food.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy");
        d.eat();    // overridden method
        d.sleep();  // inherited from Animal
        d.bark();   // Dog's own method

        System.out.println("-----");

        Cat c = new Cat("Whiskers");
        c.eat();
        c.sleep();
        c.meow();

        System.out.println("-----");

        // Polymorphism: Animal reference, Dog object
        Animal a = new Dog("Rex");
        a.eat(); // calls Dog's overridden eat()
    }
}