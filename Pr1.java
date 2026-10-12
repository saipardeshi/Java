public class Pr1 {
//    public static void main(String[] args) {
//        System.out.println("hello world");
//    }

//    public static void main(String[] args) {
//        int a =12;
//        int b=12;
//        System.out.println("sum:"+(a+b));
//    }
//public static void main(String[] args) {
//    int a=10;
//    int b=20;
//
//    System.out.println("c:"+(a+b));
//}

//    public static void main(String[] args) {
//        int n=7;
//        if(n%2==0){
//            System.out.println("Even");
//        }else{
//            System.out.println("odd");
//        }
//    }

//    public static void main(String[] args) {
//        int a=12;
//        int b=20;
//
//        if(a>b){
//            System.out.println("a");
//        }else{
//            System.out.println(b);
//        }
//    }

//    public static void main(String[] args) {
//        for(int i=1;i<=10;i++){
//            System.out.println(i);
//        }
//    }


//    public static void main(String[] args) {
//        int n=5;
//        for(int i=1;i<=10;i++){
//            System.out.println(n +"X"+i+"="+(n*i));
//        }
//    }
//public static void main(String[] args) {
//    int n=5;
//    for(int i=5;i<=10;i++)
//    System.out.println(n+"*"+i+"="+(n*i));
//}
//}

//    public static void main(String[] args) {
//        int n=5;
//        int fact=1;
//
//        for(int i=1;i<=n;i++){
//        fact =fact*i;
//        }
//        System.out.println("Factorial:"+fact);
//    }
//    }

//public static void main(String[] args) {
//    int n=5;
//    int fact=1;
//
//    for (int i=1;i<=n;i++){
//    fact=fact * i;
//    }
//    System.out.println("Factorial:"+fact);
//}
//}

//    public static void main(String[] args) {
//        int n=1234;
//        int rev=0;
//
//        while(n>0){
//        int digit=n%10;
//        rev=rev*10+digit;
//        n=n/10;
//        }
//        System.out.println("Reverse:"+rev);
//    }
//    }

//    public static void main(String[] args) {
//        int n=121;
//        int original=n;
//        int rev=0;
//
//        while(n>0){
//        int digit=n%10;
//        rev=rev*10+digit;
//        n=n/10;
//        }
//        if(original == rev){
//            System.out.println("palindrome");
//        }else {
//            System.out.println("not palindrome");
//        }
//    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int max=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Largest:"+max);
    }
    }

