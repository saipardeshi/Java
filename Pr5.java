class Mobile{
    String brand;
    int price;
    String ram;

    void display(){
        System.out.println("brand is :"+brand);
        System.out.println("price is :"+price);
        System.out.println("ram is:"+ram);
    }
}


public class Pr5 {
    public static void main(String[] args) {

        Mobile m1=new Mobile();
        m1.brand="tata";
        m1.price=30000;
        m1.ram="8gb ram";

        Mobile m2=new Mobile();
        m2.brand="motorola";
        m2.price=60000;
        m2.ram="8gb ram";

        m1.display();
        m2.display();
    }
}
