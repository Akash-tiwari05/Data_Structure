public class swapNum {
    public static void main(String[] args) {
     int a = 5; 
     int b = 7;
     int temp = a;
     a = b;
     b = temp;
     System.out.println("Value of A = " + a);
     System.out.println("Value of B = " +b); 
    //  without using third variable 
    int x = 5;
    int y = 9;
        x= x^y;//Xor operators in bits     
        y = x^y;
        x = x^y;
    System.out.println("Value of X = " +x);
    System.out.println("Value of Y = " +y);
    }
}
