class Car1{
    String color;
    String model;
    int speed;

    void accelerate(){
        speed=speed +10;
        System.out.println(model +" is going " +speed+"km/hr");
    }
    void displayInfo(){
        System.out.println("Model:" +model+", color:"+color+",speed:"+speed);
    }
}
public class Practice7 {
    public static void main(String[] args){
        Car1 myCar =new Car1();
        myCar.color="Red";
        myCar.model="tesla";
        myCar.speed=20;

        Car1 friendsCar = new Car1();
        friendsCar.color = "Blue";
        friendsCar.model = "BMW";
        friendsCar.speed = 40;

        myCar.displayInfo();
        friendsCar.displayInfo();
    }
}