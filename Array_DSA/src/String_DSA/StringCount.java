package String_DSA;

public class StringCount {
    public static void main(String[] args) {
        String s = "aaabbbcccdd";
        //
        // countAlpha(s);
        int c =1;
        StringBuilder builder= new StringBuilder();
       // int c= 1;
        //  String[] arr = new String[26];
        //int n = s.length();
        for (int i = 1; i <s.length() ; i++) {
            if(s.charAt(i) == s.charAt(i -1)){
                c++;
            }else {
                builder.append(s.charAt(i-1)).append(c);
                c=1;
            }
           //
            //System.out.println(builder.toString());
        }
        builder.append(s.charAt(s.length()-1)).append(c);
        System.out.println(builder.toString());
    }

}
