public class Loops {
    public static void main(String[] args){
        // Print numbers 1 to 5
        for(int i=1;i<=5;i++){
            System.out.println("Count: "+i);
        }
        // Print even numbers 1 to 10
        System.out.println("Even numbers:");
        for(int i=1;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        // while loop - best when we don't know exact count
        int sum=0;
        int n=1;
        while(n<=5){
            sum=sum+n;
            n++;
        }
        System.out.println("sum of 1 to 5 = "+sum);
    }
}
