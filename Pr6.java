
class Car4{
    String brand;
    String color;
    int price;

    void display(){
        System.out.println("brand is :"+brand);
        System.out.println("color is :"+color);
        System.out.println(" price is :"+price);
    }
}
public class Pr6 {
    public static void main(String[] args) {
        Car4 c1=new Car4();
        c1.brand="tata";
        c1.color="red";
        c1.price=20000;

        c1.display();
    }
}
