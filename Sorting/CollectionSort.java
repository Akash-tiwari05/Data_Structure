import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {

    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(8);
        arr.add(20);
        arr.add(17);
        arr.add(4);
        Collections.sort(arr);
        System.out.println(arr);
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);
    }
}