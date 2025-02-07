import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] ={10,5,8,20,2,18};
        int n = arr.length;
        int temp[] = new int[n];
        for (int i = 0; i < n; i++) {
            int minIndex = 0;
            for (int j = 0; j < n; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
                temp[i] = arr[minIndex];
            }
            temp[i] = arr[minIndex];
            arr[minIndex] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr));
        Optimal(arr);
    }//optimal solution does not extra space
    public static void Optimal(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int minInd = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minInd]){
                    minInd = j;
                }
                int temp = arr[minInd];
                    arr[minInd] = arr[i];
                    arr[i] = temp;
            }
        }
        System.out.println("Optimal Solution "+Arrays.toString(arr));
    } 
}
