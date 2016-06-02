package week3.testequals;

public class ColorPoint{
    private Point point;
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        point = new Point(x, y);
        this.color = color;
    }

    public Point asPoint(){
        return point;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ColorPoint)) return false;
            ColorPoint tmpPoint = (ColorPoint) o;
        return point.equals(tmpPoint.point) && tmpPoint.color == color;
    }
}
