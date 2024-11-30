package String_DSA;

public class Palindrome {
    public static void main(String[] args) {
        String s = "aammsmaa";
        int n = s.length();
        boolean isPalindrome = true;
        for(int i =0; i < n/2; i++){
            if(s.charAt(i) !=s.charAt(n - i - 1)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Palindrome "+isPalindrome );
    }
}
