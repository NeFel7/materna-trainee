package example.classesObjectsPackages;

import java.awt.*;

public class BermudaTriangle {
    public static void main(String[] args) {
        Point ship = new Point();
        ship.setLocation(1, 2);

        Polygon p = new Polygon();

        p.addPoint(5, 5);
        p.addPoint(10, 5);
        p.addPoint(10, 10);


        p = createRandomTriangle();


        for (int y = 0; y < 50; y++) {
            for (int x = 0; x < 50; x++) {
                boolean is_in_the_polygon = p.contains(x, y);
                System.out.print(is_in_the_polygon ? "\uD83D\uDC19" : "\uD83C\uDF2B");

            }
            System.out.print("\n");
        }
    }

    static Polygon resetWithRandomTriangle(Polygon polygon) {
        int size = 50;
        polygon.reset();
        polygon.addPoint((int) (Math.random() * (size + 1)), (int) (Math.random() * (size + 1)));
        polygon.addPoint((int) (Math.random() * (size + 1)), (int) (Math.random() * (size + 1)));
        polygon.addPoint((int) (Math.random() * (size + 1)), (int) (Math.random() * (size + 1)));
        return polygon;
    }
    static Polygon createRandomTriangle() {
        return resetWithRandomTriangle(new Polygon());

    }
}
