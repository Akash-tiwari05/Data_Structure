import java.util.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};

        findNumber(arr);
    }
    public static void findNumber(int[] arr ){
       // arr = {1, 2, 3, 5,6, 8, 9};
       // Arrays.sort(arr);
       int  n = arr.length +1;
        int expectSum  = ((n-1)*((n-1)+1))/2;
        int missingValue = 0;
        int sum = 0;
        for (int i = 0; i < n-1; i++) {

            sum += arr[i];

        }
        missingValue = expectSum - sum;
        System.out.println(missingValue);
    }
}
