class Printer81 {
    void print(String text) {
        System.out.println("Text: " + text);
    }

    void print(int number) {
        System.out.println("Number: " + number);
    }

    void print(String text, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(text);
        }
    }
}

public class Practice81 {
    public static void main(String[] args) {
        Printer81 p = new Printer81();

        p.print("hello");
        p.print(25);
        p.print("java", 3);
    }
}