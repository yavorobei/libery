package week3.testequals;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
//        if(o != null && o.getClass() != Point.class) return false;
        Point point = (Point) o;
        return point.x == x && point.y == y;
    }


}
