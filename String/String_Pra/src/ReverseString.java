import java.lang.reflect.GenericDeclaration;

public class ReverseString {
    public static void main(String[] args) {
        String s = "I Love DSA Course";
        System.out.println(reverse(s));
        //reverse(s);
    }
    public static String reverse(String s){
        StringBuilder builder = new StringBuilder();
        int end = s.length();
//        String arr[] = s.split(" ");
        for (int i = s.length()-1; i >= 0 ; i--) {
            if(s.charAt(i) ==' '){
                builder.append(s.substring(i+1,end)).append(" ");
                end =i;
            }


        }
        if (end > 0){
            builder.append(s.substring(0,end));
        }
        return builder.toString();
    }
}
