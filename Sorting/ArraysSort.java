
import java.util.Arrays;
import java.util.Collections;

public class ArraysSort {
    public static void main(String[] args) {
        int arr1[] = {5,20,13,50};
        char arr2[] = {'B','A','B','C','A'};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int arr[]= {5, 30, 20, 10, 8};
        Arrays.sort(arr, 1, 4);
        System.out.println(Arrays.toString(arr));

        //decending order using wrapper class {}
        Integer nums[] = {5, 1, 15 ,7 ,55};
        Arrays.sort(nums, Collections.reverseOrder());
        System.out.println(Arrays.toString(nums));
    }   
    
}