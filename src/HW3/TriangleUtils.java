package HW3;

import java.util.List;

public class TriangleUtils {
    private TriangleUtils() {

    }

    public static boolean isEquilateral(Triangle triangle) {

        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        return (a == b && a == c);
    }

    public static boolean isIsosceles(Triangle triangle) {

        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        return ((a == b && a != c) || (a == c && a != b) || (b == c && b != a));
    }

    public static boolean isRectangular(Triangle triangle) {

        double a = triangle.getA();
        double b = triangle.getB();
        double c = triangle.getC();
        double s = triangle.getArea();
        double halfAB;

        if (a > b && a > c) {
            halfAB = b * c / 2;
        } else if (b > a && b > c) {
            halfAB = a * c / 2;
        } else {
            halfAB = a * b / 2;
        }

        return (s == halfAB);
    }

    public static int equilateralCount(List<Triangle> triangles) {

        Triangle[] trianglesArray = new Triangle[triangles.size()];
        trianglesArray = triangles.toArray(trianglesArray);

        return equilateralCount(trianglesArray);
    }

    public static int equilateralCount(Triangle[] triangles) {

        int sum = 0;

        for (Triangle triangle : triangles) {
            if (isEquilateral(triangle)) {
                sum++;
            }
        }

        return sum;
    }

    public static int isoscelesCount(List<Triangle> triangles) {

        Triangle[] trianglesArray = new Triangle[triangles.size()];
        trianglesArray = triangles.toArray(trianglesArray);

        return isoscelesCount(trianglesArray);
    }

    public static int isoscelesCount(Triangle[] triangles) {

        int sum = 0;

        for (Triangle triangle : triangles) {
            if (isIsosceles(triangle)) {
                sum++;
            }
        }

        return sum;
    }

    public static int rectangularCount(List<Triangle> triangles) {

        Triangle[] trianglesArray = new Triangle[triangles.size()];
        trianglesArray = triangles.toArray(trianglesArray);

        return rectangularCount(trianglesArray);
    }

    public static int rectangularCount(Triangle[] trianglesArray) {
        int sum = 0;

        for (Triangle triangle : trianglesArray) {
            if (isRectangular(triangle)) {
                sum++;
            }
        }

        return sum;
    }

    public static Triangle getMaxAreaTriangle(List<Triangle> triangles) {

        Triangle[] trianglesArray = new Triangle[triangles.size()];
        trianglesArray = triangles.toArray(trianglesArray);

        return getMaxAreaTriangle(trianglesArray);
    }

    public static Triangle getMaxAreaTriangle(Triangle[] triangles) {

        Triangle maxAreaTriangle = triangles[0];

        for (int i = 1, size = triangles.length; i < size; i++) {
            if (triangles[i].getArea() > maxAreaTriangle.getArea()) {
                maxAreaTriangle = triangles[i];
            }
        }

        return maxAreaTriangle;
    }

    public static Triangle getMinAreaTriangle(List<Triangle> triangles) {

        Triangle[] trianglesArray = new Triangle[triangles.size()];
        trianglesArray = triangles.toArray(trianglesArray);

        return getMinAreaTriangle(trianglesArray);
    }

    public static Triangle getMinAreaTriangle(Triangle[] triangles) {

        Triangle minAreaTriangle = triangles[0];

        for (int i = 1, size = triangles.length; i < size; i++) {
            if (triangles[i].getArea() < minAreaTriangle.getArea()) {
                minAreaTriangle = triangles[i];
            }
        }

        return minAreaTriangle;
    }
}
