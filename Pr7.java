class Student10{
    String name;
    int maths;
    int science;
    int english;

    void display(){
        int total=maths+science+english;
        double average =total/3.0;

        System.out.println("Name :"+name);
        System.out.println("Total is:"+total);
        System.out.println("Average is :"+average);
    }
}

public class Pr7 {
    public static void main(String[] args) {
        Student10 s1 = new Student10();
        s1.name="sai";
        s1.maths=20;
        s1.science=30;
        s1.english=40;


        Student10 s2=new Student10();
        s2.name="abhi";
        s2.maths=30;
        s2.science=50;
        s2.english=90;

        s2.display();
        s1.display();


    }
}
