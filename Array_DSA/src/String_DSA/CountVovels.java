package String_DSA;

public class CountVovels {
    public static void main(String[] args) {
        String s = "Aakash Tiwari";
        int n = s.length();
        int count = 0;
        s= s.toLowerCase();
        for (int i = 0; i < n; i++) {
          char  ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||  ch== 'u') {

                count++;
            }
        }
        System.out.println("No. of Vovels = "+ count);
    }
}
