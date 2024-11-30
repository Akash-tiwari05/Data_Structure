package Array_DSA;

public class Average {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 7, 9};
        System.out.println(avg(arr));

    }
    public static int avg(int[] arr){
        int n = arr.length;
        int sum = 0;
        int avg = 0;
        for(int i =0; i < n; i++ ){
            sum  += arr[i];
            avg = sum/n;
        }
        return avg;
    }
}
