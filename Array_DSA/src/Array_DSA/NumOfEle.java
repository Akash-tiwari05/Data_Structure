package Array_DSA;

public class NumOfEle {
    public static void main(String[] args) {
        int[] arr ={0,1, 0, 0,1, 1, 0};
        int[] result = elem(arr);
        System.out.println("No of zeros in Array = "+ result[0]);
        System.out.println("No of zeros in Array = "+ result[1]);
    }
    public static int[] elem(int[] arr){
        int n = arr.length;
        int zero =0;
        int one = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0) zero++;
            if(arr[i] == 1) one++;
        }
        return new int[]{zero, one};

    }
}
