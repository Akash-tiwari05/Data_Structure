 import java.util.Scanner;
 public class checkOdd {
 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     evenOrOdd(n);
    }
    public static void evenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
 }