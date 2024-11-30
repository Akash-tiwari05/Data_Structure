package String_DSA;


import javax.print.DocFlavor;
import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
        String  s ="I Love Dsa Course";
       //String reverseString = reverseWord(s);
        System.out.println((Arrays.toString(reverseWord(s))));

    }
    public static String[] reverseWord(String s){
        String[] arr = s.split(" ");

        int n = arr.length;

        for(int i =0; i < n/2; i++){
            String temp = arr[i];
            arr[i] = arr[n-i-1];
           arr[n-i-1] = temp;
           //System.out.println(Arrays.toString(arr));
        }
        return new String[]{String.join(" ", arr)};
//        return Arrays.toString(arr);

    }
}
