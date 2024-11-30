package Array_DSA;

public class FindArray {
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 30, 40 ,50};
        System.out.println("Search the element index = "+findArray(arr));
    }
    public static int findArray(int[] arr){
        int num = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 30){
                num = i;
            }
        }
        return num;
    }
}
