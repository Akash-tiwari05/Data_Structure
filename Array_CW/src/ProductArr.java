import java.util.Arrays;

public class ProductArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
       arrayProd(arr);
        System.out.println("....................................");
        productSelf(arr);
    }
    public static void  arrayProd(int[] arr){
        int n = arr.length;
        int[] prod =new int[n];
        int[] prefix = new int[n];
        prefix[0] =1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1]*arr[i-1];
        }
        int[] suffix = new int[n];

        suffix[n-1] = 1;
        for (int i = n-2; i >= 0 ; i--) {
            suffix[i] = suffix[i+1]*arr[i+1];
        }
        for (int i = 0; i <n ; i++) {
            prod[i] = suffix[i]* prefix[i];
        }
        System.out.println(Arrays.toString(prod));
    }
    public static void productSelf(int[] arr){
        int n= arr.length;
        int[] prod = new int[n];
        int[] prefix = new int[n];
        prefix[0] = 1;
        for (int i = 1; i <n ; i++) {
            prefix[i] = prefix[i-1]*arr[i-1];
        }
        int suffix =1;
        for (int i = n-1; i >= 0 ; i--) {
            prod[i] = suffix* prefix[i];
            suffix *= arr[i];
        }
        System.out.println(Arrays.toString(prod));
    }
}
