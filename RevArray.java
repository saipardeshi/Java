import java.util.Scanner;

public class RevArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size :");
        int size=sc.nextInt();

        int[] arr=new int[size];
        System.out.print("Enter array element :");
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        int start=0;
        int end=arr.length -1;
        while(start <end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed array : ");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
        }
        }
