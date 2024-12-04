// Set ith bit the given question which was ask in microsft


public class setBit {
        public static void main(String[] args) {
            int[] array = {1, 4, 3, 1, 2, 4, 5, 6, 5, 6};
            int[] result = findTwoNonRepeatingElements(array);
            System.out.println("The two non-repeating elements are: " + result[0] + " and " + result[1]);
        }
    
        public static int[] findTwoNonRepeatingElements(int[] array) {
            // Step 1: XOR all elements to get XOR of the two unique elements
            int xorResult = 0;
            for (int num : array) {
                xorResult ^= num;
            }
    
            // Step 2: Find a bit that is set in xorResult (i.e., a bit that is different in the two unique elements)
            int distinguishingBit = xorResult & -xorResult; // Isolates the rightmost set bit
    
            // Step 3: Use the distinguishing bit to divide elements into two groups and find the unique elements
            int unique1 = 0, unique2 = 0;
            for (int num : array) {
                if ((num & distinguishingBit) == 0) {
                    unique1 ^= num; // XOR all numbers with the distinguishing bit set to 0
                } else {
                    unique2 ^= num; // XOR all numbers with the distinguishing bit set to 1
                }
            }
    
            return new int[]{unique1, unique2};
        }
    }
     
