public class Majority {
    public static void main(String[] args) {
        int[] arr = {3,3, 4, 2, 3, 3, 3};
        int res = majority(arr);
        System.out.println(res);
    }
    public static int majority(int[] arr){
        int n = arr.length;
        int count =0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]) count++;
            }
            if(count >n/2)
                return arr[i];
        }
       return  -1;
    }
}
