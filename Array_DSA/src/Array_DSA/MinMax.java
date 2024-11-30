package Array_DSA;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {10,30,20,50};
        System.out.println("Your max no is = "+ Max(arr));
        System.out.println(".....................................");
        System.out.println("Your min no is = "+ Min(arr));
    }
    public static int Max(int[] arr){
        int temp = arr[0];
        int n= arr.length;
        if(n == 1) return n;
        for(int i =1; i < n; i++){
            if(arr[i] > temp){
               // arr[i] = arr[i+1];
                temp = arr[i];
            }
        }return temp;
    }
    public static int Min(int[] arr) {
        int min = arr[0];
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
