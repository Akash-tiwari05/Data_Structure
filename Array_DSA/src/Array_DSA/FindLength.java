package Array_DSA;

public class FindLength {

    public static void main(String[] args) {
        int arr[] = {1,4,5,8,4,2};
        System.out .println("Array length is = "+FindArray(arr));
    }

    public static int FindArray(int[] arr)
    {
      // Don't use Pre Defined Methods or Keyword
        int count = 0;
      for(int i =0; i<arr.length; i++){
          count++;
      }
      return count;
      //return arr.length; don't use this method
    }
}
