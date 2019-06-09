package HW4.Triangle;

public class TriangleRunner {
    public static void main(String[] args) {

        Triangle[] triangles = new Triangle[]{
                new Triangle(new Point(1, 1), new Point(3, 3), new Point(5, 5)),
                new Triangle(new Point(5, 5), new Point(-5, -5), new Point(6, 6)),
                new Triangle(new Point(3, 4), new Point(7, 8), new Point(-8, 1)),
                new Triangle(new Point(-4, -1), new Point(-1, 2), new Point(1, -2)),
                new Triangle(new Point(4, -1), new Point(-3, -4), new Point(2, 2)),
                new Triangle(new Point(1, 1), new Point(4, 1), new Point(1, 2)),
                new Triangle(new Point(1, 3), new Point(2, -5), new Point(-8, 4))
        };
    }
}
