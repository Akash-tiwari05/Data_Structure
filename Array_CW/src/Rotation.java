import java.util.Arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] arr= { 1,3,5,7,9};
        int k =3;
       rotate(arr,k);
    }
    public static void rotate(int[] arr, int k){
        int  n= arr.length;
        //k= 3;
        reverse(arr, 0, k-1);
        reverse(arr, k , n-1);
        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
        //return null;
    }
    public static void reverse(int [] arr, int left, int right){

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        //System.out.println(Arrays.toString(arr));
    }
}
