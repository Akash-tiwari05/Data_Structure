import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveNegValue {
    public static void main(String[] args) {
        int[] arr= { 2, -1, 4, -5, -3, 2};
        moveNegativeValue(arr);
    }
    public static void moveNegativeValue(int[] arr){
        int l = 0;
        int p= 0;
        while(p < arr.length){
            if(arr[p] < 0){
                int temp  = arr[l];
                arr[l] = arr[p];
                arr[p] = temp;
                l++;
               // p++;
            }
            p++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
