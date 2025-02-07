//Even First Using Our Comarator Operator

import java.util.Arrays;
import java.util.Comparator;

class myComp implements Comparator<Integer>{

    @Override
    public int compare(Integer x1, Integer x2) {
       return x1 %2 -x2 %2;
    }

}

public class EvenFirst {
    public static void main(String[] args) {
        Integer arr[] = {10,6,5,7,2};
        Arrays.sort(arr, new myComp());
        System.out.println(Arrays.toString(arr));
    }
}
