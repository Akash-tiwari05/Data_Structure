import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6};
        int[] arr2 = {1, 3, 5, 7};
        int n = arr1.length;
        int m = arr2.length;
        int o = n + m;
        int[] arr3 = new int[o];
        int res = merge(arr1, arr2, arr3, n, m);
        System.out.println("Merged Array: " + Arrays.toString(arr3));
    }

    public static int merge(int[] arr1, int[] arr2, int[] arr3, int n, int m) {
        int i = 0, j = 0, k = 0;

        // Merge the two arrays while maintaining order
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                arr3[k++] = arr2[j++];
            } else { // If both are equal, add only one of them to avoid duplicates
                arr3[k++] = arr1[i++];
                j++; // Move pointer in arr2 to skip the duplicate
            }
        }

        // If there are remaining elements in arr1
        while (i < n) {
            arr3[k++] = arr1[i++];
        }

        // If there are remaining elements in arr2
        while (j < m) {
            arr3[k++] = arr2[j++];
        }

        return k; // Return the size of the merged array (without duplicates)
    }
}
