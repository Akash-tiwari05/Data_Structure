//for non premative uing comarable operator

import java.util.Arrays;

class Point implements Comparable<Point> {
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int compareTo(Point p){
        return this.x - p.x;
    }
}

public class AraysSort2 {
    public static void main(String[] args) {
        Point arr[] = {new Point(10, 20), new Point(3, 12), new Point(5, 7)};
        Arrays.sort(arr);
        for (int i = arr.length  - 1; i >= 0; i--) {
            System.out.println(arr[i].x +" "+ arr[i].y);
        }
    }
    
}
