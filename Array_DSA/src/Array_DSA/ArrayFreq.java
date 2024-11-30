package Array_DSA;

public class ArrayFreq {
    public static void main(String[] args) {

        int[] arr = {1, 10, 2, 1, 0, 1, 5 , 3 ,1, 1};
        System.out.println("No of 1's in this coe is = "+ freq(arr));
    }
    public static int freq(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i = 0; i<n; i++){
            if(arr[i] == 1) {
                count++;
            }
        }
        return count;
    }
}
