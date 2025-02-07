import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSorted {
    public static void main(String[] args) {
        int a[] = {10,15,20, 20};
        int b[] = {1,12};
       // MergeArray(a,b);

        mergeTwoArray(a, b);

    }
    public static void MergeArray(int a[], int b[]){
        int n=  a.length;
        int m =  b.length;
        int c[] = new int[n+m]; 
        for (int i = 0; i < n; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            c[n+i] = b [i];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }
    //eficient solution
    public static void mergeTwoArray(int a[], int b[]){
         int n=  a.length;
         int m =  b.length;
        
        List<Integer> list = new ArrayList<>();
        int i = 0, j= 0;
        while(i<n && j < m){
            if(a[i] <=  b[j]){
                list.add(a[i]);
                i++;
            }else{
                list.add(b[j]);
                j++;
            }
        }
        while(j < m){
            list.add(b[j]);
            j++;
        }
        while (i < n) {
             list.add(a[i]);
             i++;
        }
        System.out.println(list);
    }
}
