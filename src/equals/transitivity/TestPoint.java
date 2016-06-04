package equals.transitivity;

import java.awt.*;
import java.awt.Point;

/**
 * Created by gorobec on 31.05.16.
 */
public class TestPoint {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        ColorPoint cp2 = new ColorPoint(1, 2, Color.BLUE);
        System.out.println("p.equals(cp) -> " + p.equals(cp));
        System.out.println("cp.equals(p) -> " +  cp.equals(p));
        System.out.println("p.equals(cp2) -> " +  p.equals(cp2));
        System.out.println("cp.equals(cp2) -> " +  cp.equals(cp2));
    }
}
