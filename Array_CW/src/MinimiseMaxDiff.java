import java.util.Arrays;

public class MinimiseMaxDiff {
    public static void main(String[] args) {
        int[] arr= {4, 6, 2, 8, 10, 14};
        int n =arr.length;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int temp = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = temp;
//            }
//        }
        Arrays.sort(arr);
        int k = 2;
        int minDifference = mimDiff(arr,k);
        System.out.println(minDifference);
    }
    public static int mimDiff(int[] arr, int k){
        int n= arr.length;
        int res= arr[n-1] -arr[0];
        for (int i = 1; i < n; i++) {

            if(arr[i] -k <0) continue;
            int min = Math.min(arr[0] +k, arr[i] -k);
            int max = Math.max(arr[i-1] +k, arr[n-1]-k);
            res=  Math.min(res, max- min);
        }
        return res;
    }
}
