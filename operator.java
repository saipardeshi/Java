import java.sql.SQLOutput;

public class operator {
    public static void main(String[] args) {
       // Arithmetic +-*/%
        int num1=10;
        int num2=10;
        System.out.println(num1 +num2);
        System.out.println(num1 - num2);

        System.out.println(num1 *num2);
        System.out.println((double)num1 / num2);

        System.out.println(num1 %num2);
        //Relational operator

        int a=10;
        int b=20;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        //Logical

        int x = 10;
        int y = 20;
        int c = 30;

        boolean cond1 = false;
        boolean cond2 = (y < c);
        boolean cond3 = (x < c);

        boolean answer1 = cond1 && cond2 && cond3;
        System.out.println(answer1);

        boolean answer2 = cond1 || cond2 || cond3;
        System.out.println(answer2);

        boolean answer3 = !cond1;
        System.out.println(answer3);

    }
}
