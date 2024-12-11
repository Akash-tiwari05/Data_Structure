import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr ={1,2, 0,4, 3,0,5,0};
        moveZeros(arr);
    }
    // Two Pointer Approach
    public static void moveZeros(int[] arr){
        int j= 0;
       ;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] !=0 && arr[j] == 0){
               int temp = arr[j];
                arr[j] =arr[i];
                arr[i] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
