package String_DSA;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "aksh";
        String s2 = "astk";
        System.out.println(anagram(s1,s2)+ " This is Anagram");
    }
    public static boolean anagram(String s1, String s2){
        //String[] arr = new String[]
        int n = s1.length();
        int m = s2.length();

        char ch1[] = s1.toCharArray();
        char ch2[] = s2.toCharArray();

//        boolean flag = true;
        if(n !=m) return false;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if(ch1[i] == ch2[j]) {
                    flag = true;
                    ch2[j] = '?';
                    break;
                }
            }
            if(!flag) return false;
        }
    return true;

    }
}
