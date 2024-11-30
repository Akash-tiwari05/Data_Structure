package Array_DSA;

public class SumOFAlternate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("Sum of Odd = "+ sumOfOddAlt(arr));
        System.out.println("............................................");
        System.out.println("Sum of Even = "+ sumOfEvenAlt(arr));
    }
    public static int sumOfOddAlt(int[] arr){
        int Odd = 0;
        int n= arr.length;
        for(int i = 0; i< n; i++){
            if(i %2 != 0) continue;
            Odd += arr[i];
        }
        return Odd;
    }
    public static int sumOfEvenAlt(int[] arr){
        int Even = 0;
        int n= arr.length;
        for(int i = 0; i< n; i++){
            if(i %2 == 0) continue;
            Even += arr[i];
        }
        return Even;
    }
}
