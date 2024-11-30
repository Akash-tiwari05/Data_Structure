package String_DSA;

import java.util.Arrays;

public class Duplicate {
    public static void main(String[] args) {
        String s = "aakashh";
        Duplicate(s);
    }
    public static void Duplicate(String s){
        //String[] arr = new String[26];
        int[] arr = new int[26];
        int count =1;
        for (int i = 0; i < s.length(); i++) {
            int charValue = s.charAt(i);
            int ind = charValue-97;
            arr[ind]++;


        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] >1){
                char c = (char) (i+97);
                System.out.println("Duplicate value is = "+c);
            }
        }

    }
}
