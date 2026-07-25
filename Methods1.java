//import static jdk.vm.ci.code.CodeUtil.isEven;
//
//public class Methods1 {
//    public static void greet(){
//        System.out.println("hello world ");
//
//    }
//    public static void greetPerson(String name){
//        System.out.println("Hello,"+name+"!");
//    }
//    public static int add(int a,int b){
//        return a+b;
//    }
//    public static void main(String[] args){
//        greet();// calling method with no params
//        greetPerson("Sai");// calling method with a param
//        int sum=add(5,10); // capturing the returned value
//
//        System.out.println("Is 7 even? "+ isEven(7));
//        System.out.println("Is 8 even? " + isEven(8));
//    }
//}
public class Methods1 {
    public static void greet() {
        System.out.println("Hello there!");
    }

    public static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        greet();
        greetPerson("Sai");
        int sum = add(5, 10);
        System.out.println("Sum: " + sum);
        System.out.println("Is 7 even? " + isEven(7));
        System.out.println("Is 8 even? " + isEven(8));
    }
}