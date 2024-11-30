package Array_DSA;

public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Sum of Array is = "+ SumOFArray(arr));

    }
    public static int SumOFArray(int[] arr){
        int sum = 0;
        int n = arr.length;
        for(int i = 0; i<n ; i++){
            sum += arr[i];
        }
        return sum;
    }
}
