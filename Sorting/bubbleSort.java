import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {2, 10, 8 , 7};
        Bubble(arr);
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
       
    }
    //Customize solution;
    public static void Bubble(int arr[]){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i- 1; j++) {
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) break;
        }
        System.out.println("New array "+Arrays.toString(arr));
    }
}
