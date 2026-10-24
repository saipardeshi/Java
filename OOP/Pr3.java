package OOP;

class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}

public class Pr3 {
    public static void main(String[] args) {
        Dog d = new Dog("tommy");
        d.eat();
        d.bark();
    }
}