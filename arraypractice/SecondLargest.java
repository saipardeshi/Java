package arraypractice;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int Largest=arr[0];
        int SecondLargest=arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i]>Largest){
                SecondLargest =Largest;
                Largest=arr[i];
            }
            else if(arr[i] >SecondLargest && arr[i] != Largest){
                SecondLargest =arr[i];
            }
        }
        System.out.println("Second largest element ="+SecondLargest);
    }
}
