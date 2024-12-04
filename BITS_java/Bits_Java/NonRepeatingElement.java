// public class NonRepeatingElement {

// //     public static int findNonRepeating(int[] arr) {
// //         int ones = 0, twos = 0;
// //         int common_bit_mask;

// //         for (int i = 0; i < arr.length; i++) {
// //             /* "ones & arr[i]" gives the bits that are there in both 'ones' and new element from arr[]. 
// //                We add these bits to 'twos' using bitwise OR 
// //                Value of 'twos' will be set as 0, 3, 0 and 3 after 1st, 2nd, 3rd and 4th iterations respectively */
// //             twos = twos | (ones & arr[i]);

// //             /* XOR the new bits with previous 'ones' to get all bits appearing odd number of times */
// //             ones = ones ^ arr[i];

// //             /* The common bits are those bits which appear third time. So these bits should not be there in both 'ones' and 'twos'. 
// //                common_bit_mask contains all these bits as 0, so that the bits can be removed from 'ones' and 'twos' */
// //             common_bit_mask = ~(ones & twos);

// //             /* Remove common bits (the bits that appear third time) from 'ones' */
// //             ones &= common_bit_mask;

// //             /* Remove common bits (the bits that appear third time) from 'twos' */
// //             twos &= common_bit_mask;
// //         }

// //         return ones;
// //     }

// //     public static void main(String[] args) {
// //         int[] arr = { 1, 1, 1, 2, 2, 2, 3, 4, 4, 4 };
// //         int nonRepeatingElement = findNonRepeating(arr);
// //         System.out.println("The non-repeating element is: " + nonRepeatingElement);
// //     }
// // }
public class NonRepeatingElement {

    public static int findNonRepeating(int[] arr, int k) {
        int[] count = new int[32]; // Assuming integers are 32-bit
        
        // Count occurrences of each bit position across all numbers
        for (int num : arr) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    count[i]++;
                }
            }
        }

        int result = 0;
        
        // Form the result by considering bits which are not multiple of k
        for (int i = 0; i < 32; i++) {
            if (count[i] % k != 0) {
                result |= (1 << i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 6, 6, 8, 8, 8, 7, 10, 10, 10, 12, 12, 12 };
        int k = 3; // Each number repeats 3 times except one
        int nonRepeatingElement = findNonRepeating(arr, k);
        System.out.println("The non-repeating element is: " + nonRepeatingElement);
    }
}

