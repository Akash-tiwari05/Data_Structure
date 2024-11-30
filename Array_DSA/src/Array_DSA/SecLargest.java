package Array_DSA;

public class SecLargest {
    public static void main(String[] args) {
        int[] arr = {16, 30, 20, 40, 15, 35};
        System.out.println("Second Largest Element = " + secLargest(arr));
        System.out.println("...................................");
        System.out.println("Second Smallest Element is = "+ secMin(arr));
    }

    public static int secLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                //arr[i] = arr[i+1];
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
//            if (secMax < arr[i] && arr[i] < max) {
//                //arr[i] = arr[i+1];
//                secMax = arr[i];
//            }
        }
        if(secMax == Integer.MIN_VALUE){
            return -1;
        }
        else {
            return secMax;
        }
    }

    public static int secMin(int[] arr) {

        int n = arr.length;
        if (n < 2) return -1;
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (min > arr[i]) {
                //arr[i] = arr[i+1];
                secMin = min;
                min = arr[i];
            }
            else  if (secMin > arr[i] && arr[i] != min) {
                //arr[i] = arr[i+1];
                secMin = arr[i];
            }
        }
        return secMin;
    }
}
