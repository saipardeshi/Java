public class ReverseArray2 {
    public static void main(String[] args){

        int[] arr={12,13,14,15,16,17};
        int[] reverse=new int[arr.length];

        for (int i=0;i<arr.length;i++) {
            reverse[i] = arr[arr.length - 1 - i];

        }
        for (int num : reverse)
        {
            System.out.print(num + " ");
        }
        }
    }
