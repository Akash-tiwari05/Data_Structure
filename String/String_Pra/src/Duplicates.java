import java.util.Arrays;

public class Duplicates {
    public static void main(String[] args) {

        String s = "aakassh";
        System.out.println(duplicates(s));
    }
    public static String duplicates(String s){
        char arr[] = new char[26];
        StringBuilder build = new StringBuilder();
        int n = s.length();
       // int count =1;
        char c;
        for (int i = 0; i <n ; i++) {
            int charVal = s.charAt(i);
            int indVal = charVal - 97;
            arr[indVal]++;
            // c = (char) (indVal + 97);
        }
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > 1){
                c= (char) (i + 97);
//                System.out.println("The Duplicate Value is = "+ c);
                build.append(c).append(" ");
            }
        }return build.toString();
    }
}
