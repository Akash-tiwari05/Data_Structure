package Array_DSA;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        reverse(arr);

    }
    public static void reverse(int[] a){
        int n = a.length;
        int temp = 0;
        for(int i = 0; i < n/2; i++){
             temp = a[i];
             a[i] = a[n - i -1];
             a[n - i - 1] =  temp;
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Reverse the Array is : \n");
//        for (int k = 0; k < n; k++){
//            System.out.println(a[k]);
//        }
    }
}
