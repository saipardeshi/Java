abstract class AnimalX {
    private String name;

    public AnimalX(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String makeSound();

    public void showInfo() {
        System.out.println(name + " says " + makeSound());
    }
}

class DogX extends AnimalX {
    public DogX(String name) {
        super(name);
    }

    public String makeSound() {
        return "Woof";
    }
}

class CatX extends AnimalX {
    public CatX(String name) {
        super(name);
    }

    public String makeSound() {
        return "Meow";
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        AnimalX a1 = new DogX("Tommy");
        AnimalX a2 = new CatX("Kitty");

        a1.showInfo();
        a2.showInfo();
    }
}