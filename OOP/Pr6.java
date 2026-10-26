package OOP;
class Calculator{
    int add(int a,int b){
        return a+b;
    }
}
public class Pr6 {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        System.out.println(c.add(10,20));
    }
}
