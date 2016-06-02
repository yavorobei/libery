package week3.testequals;

/**
 * Created by 1 on 30.05.2016.
 */
public class PointEqualsTest {
    public static void main(String[] args) {
        System.out.println("Сравниваем обычную точку и цветную точку:");
        Point p1 = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        ColorPoint cp2 = new ColorPoint(1, 2, Color.BLUE);
        System.out.println("p equals cp = " + p1.equals(cp.asPoint()));
        System.out.println("cp equals cp2 = " + cp.equals(cp2));
        System.out.println("p equals cp2 = " + p1.equals(cp2.asPoint()));

    }
}
