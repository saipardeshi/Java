public class connditionals3 {
    public static void main(String[] args) {
        int age = 20;
        boolean knowDriving = true;

        if (age > 18) {
            System.out.println("your age is >18");

            if (knowDriving == true) {
                System.out.println("you can get a license");
            } else {
                System.out.println("learn driving ");
            }
        } else {
            System.out.println("age should be 18+");
        }
    }
}