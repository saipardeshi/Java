abstract class Instrument1 {
    String name;

    Instrument1(String name) {
        this.name = name;
    }

    abstract void play();

    void info() {
        System.out.println("This is a " + name);
        play();
    }
}

class Guitar1 extends Instrument1 {
    Guitar1() {
        super("Guitar");
    }

    @Override
    void play() {
        System.out.println("Strumming the guitar!");
    }
}

class Piano1 extends Instrument1 {
    Piano1() {
        super("Piano");
    }

    @Override
    void play() {
        System.out.println("Playing the piano keys!");
    }
}

public class Practice17 {
    public static void main(String[] args) {
        Instrument1[] instruments = {
                new Guitar1(),
                new Piano1()
        };

        for (Instrument1 i : instruments) {
            i.info();
        }
    }
}