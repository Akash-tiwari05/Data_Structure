/**
 * bit
 */
public class bit {
    public static void main(String[] args) {
        System.out.println((5 & 6)); //Binary AND
        System.out.println((5 | 6)); // BINARY OR
        System.out.println((5 ^ 6)); // BINARY XOR
        System.out.println((~0)); //1's compliment and not binary
        System.out.println((5 << 2));// BINARY LEFT SHIFT
        System.out.println((7 >> 2));// BINARY RIGHT SHIFT
        System.out.println(5 ^3); // XOR operator in BITS
        int x = 3;
        int y =1;
        int z = (x << y);// left shift operator;
        System.out.println(z);
    }
    
}