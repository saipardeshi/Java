public class ReverseArray {
  public static void main(String[] args){
      int[] arr ={12,13,14,15,16};
      int start=0;
      int end=arr.length -1;

      while(start <end ){
          int temp =arr[start];
          arr[start]=arr[end];
          arr[end]=temp;

          start++;
          end--;
      }
      System.out.println("reversed array");

      for(int num:arr){
          System.out.print(num + " ");
      }
  }

}

