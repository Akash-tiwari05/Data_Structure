//sorting of non preamitive using Comparator

import java.util.Arrays;
import java.util.Comparator;

class Point{
    int x ,  y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}
class myCom implements Comparator<Point>{

    @Override
    public int compare(Point p1, Point p2) {
        return p1.x - p2.x;
    }

}

public class usingComperator {
    public static void main(String[] args) {
        
    
    Point arr[] = {new Point(10, 20), new Point(3, 12), new Point(5, 7)};
        Arrays.sort(arr, new myCom());
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x +" "+ arr[i].y);
        }
    }
}
