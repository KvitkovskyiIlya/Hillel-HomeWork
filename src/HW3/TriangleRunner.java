package HW3;

import java.util.ArrayList;
import java.util.List;

import static HW3.TriangleUtils.*;

public class TriangleRunner {
    public static void main(String[] args) {

        List<Triangle> triangles = new ArrayList<>();
        triangles.add(new Triangle(7, 7, 7));
        triangles.add(new Triangle(5, 4., 3));
        triangles.add(new Triangle(1, 1.5, 1));
        triangles.add(new Triangle(10.6, 8., 4));
        triangles.add(new Triangle(8, 6, 3));
        triangles.add(new Triangle(4.8, 9, 6));
        triangles.add(new Triangle(5, 5, 5));


        for (Triangle triangle : triangles) {
            System.out.println(triangle);

            System.out.print("Area = ");
            System.out.println(triangle.getArea());

            System.out.print("Perimeter = ");
            System.out.println(triangle.getPerimeter());

            System.out.println();
        }

        System.out.print(equilateralCount(triangles));
        System.out.print(" equilateral, ");
        System.out.print(isoscelesCount(triangles));
        System.out.print(" isosceles, ");
        System.out.print(rectangularCount(triangles));
        System.out.println(" rectangular triangle");

        System.out.print("Max area = ");
        System.out.println(getMaxAreaTriangle(triangles));

        System.out.print("Min area = ");
        System.out.println(getMinAreaTriangle(triangles));
    }
}
