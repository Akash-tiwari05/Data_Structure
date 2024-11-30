package Array_DSA;

import java.util.Arrays;

public class ArrayShort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 9, 7, 13};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Second minimum = "+arr[1]);
        System.out.println("Second largest = "+arr[arr.length - 2]);
    }
}