public class largestSum {
    public static void main(String[] args) {
        int[] arr= {2,3, -8, 7, -1, 2, 3};
        System.out.println(larSum(arr));
    }
    public static int larSum(int[] arr){
        int n= arr.length;
        int res= arr[0];
        for (int i = 0; i < n; i++) {
            int sum =0;
            for (int j = i+1; j < n; j++) {
                 sum += arr[j];
                 
                res = Math.max(sum,res);
            }
        }return res;
    }
}
