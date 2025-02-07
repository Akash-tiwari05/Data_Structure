//user define class sorting using comparable

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


class Point implements Comparable<Point>{
    int x, y;
    Point(int x, int y){
        this.x= x;
        this.y=y;
    }

    @Override
    public int compareTo(Point p) {
        return this.x - p.x;
    }

}

public class CollectionSorts2 {
    public static void main(String[] args) {
        List<Point> arr = new ArrayList<>();
        arr.add(new Point(20, 30));
        arr.add(new Point(10, 10));
        arr.add(new Point(27, 13));
       
        Collections.sort(arr);
       
        for (Point point : arr) {
            System.out.println(point.x+" "+point.y);
        }
    }
}
