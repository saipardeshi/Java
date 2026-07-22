public class Arrays1 {
    public static void main(String[] args){
        int [] numbers={10,20,30,40,50,60};

        System.out.println("First number: " +numbers[0]);
        System.out.println("Third number: " +numbers[2]);

        numbers[1]=99;
        System.out.println("After change: " +numbers[1]);

        System.out.print("All numbers:");
        for(int i=0;i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("using for-each:");
        for(int num: numbers){
            System.out.println(num);
        }
        String[] fruits={"Apple","Banana","Mango"};
        System.out.println("Fruit list:");
        for(String fruit: fruits){
            System.out.println(fruit);
        }

    }
}
