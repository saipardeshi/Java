public class GCD1 {
    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("GCD/HCF is: " + a);
    }
}