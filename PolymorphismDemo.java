class Animal3{
    String name;

    Animal3(String name){
        this.name = name;
    }
    void makeSound(){
        System.out.println(name + " makes a generic animal sound.");
    }
}
class Dog2 extends Animal3{
    Dog2(String name){
        super(name);
    }

    @Override
    void makeSound(){
        System.out.println(name +"says :woof woof");
    }
}
class Cat2 extends Animal3{
    Cat2(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow!");
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal3 myAnimal = new Animal3("Generic Animal");
        Animal3 myDog = new Dog2("Rex");
        Animal3 myCat = new Cat2("Whiskers");

        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();

        // Polymorphism in action - array of parent type holding different child objects
        Animal3[] animals = { myAnimal, myDog, myCat };
        System.out.println("Looping through all animals:");
        for (Animal3 a : animals) {
            a.makeSound();
        }
    }
}



