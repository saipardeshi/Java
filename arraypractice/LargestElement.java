package arraypractice;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};

        int Largest=arr[0];

        for(int i=1;i< arr.length;i++){
            if(arr[i]>Largest){
                Largest =arr[i];
            }
        }
        System.out.println("Largest element ="+Largest);
    }
}
