import java.util.Scanner;

public class OverallPercentage {
    public static void main(String[] args) {

        Scanner ac=new Scanner(System.in);
        System.out.println("Enter marks of subject : ");
        int m1=ac.nextInt();
        int m2=ac.nextInt();
        int m3=ac.nextInt();
        int m4=ac.nextInt();
        int total=m1+m2+m3+m4;
        double percentage=total/4.0;
        System.out.println("total is"+total);
        System.out.println("percentage is"+percentage +"%");
    }
}
