package Array_DSA;

import java.util.Arrays;

public class ReverseArr2 {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        reverse(arr);

    }
    public static void reverse(int[] a){
        int n = a.length;        int[] b = new int[n];
        int j = n;
        for(int i = 0; i < n; i++){
            b[j -1] = a[i];
            j = j-1;
        }
        System.out.println(Arrays.toString(b));
        System.out.println("Reverse the Array is : \n");
//        for (int k = 0; k < n; k++){
//            System.out.println(a[k]);
//        }
    }
}
