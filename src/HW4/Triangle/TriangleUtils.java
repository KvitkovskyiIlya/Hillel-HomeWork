package HW4.Triangle;

import java.util.Arrays;

public class TriangleUtils {

    Triangle[] triangles;

    public TriangleUtils(Triangle[] triangles) {
        this.triangles = triangles;
    }

    public String quantityOfTriangles(Triangle[] triangles) {
        int countEquilateral = 0;
        int countRectangular = 0;
        int countIsosceles = 0;
        int countArbitrary = 0;

        for (Triangle i : triangles) {
            if (i.isEquilateral()) {
                countEquilateral++;
            }
            if (i.isIsosceles()) {
                countIsosceles++;
            }
            if (i.isRectangular()) {
                countRectangular++;
            }
            if (i.isArbitrary()) {
                countArbitrary++;
            }
        }
        return "Equilateral = " + countEquilateral + " Isosceles = " + countIsosceles +
                " Rectangular = " + countRectangular + " Arbitrary = " + countArbitrary;
    }

    private Triangle findMinArea(Triangle[] triangles, String typeOfTriangle) {
        Triangle minValue = null;
        for (Triangle i : triangles)
            if (i.typeOfTriangle().equals(typeOfTriangle)) {
                if (minValue == null) {
                    minValue = i;
                } else if (i.area() < minValue.area()) {
                    minValue = i;
                }
            }
        return minValue;
    }

    private Triangle findMaxArea(Triangle[] triangles, String typeOfTriangle) {
        Triangle maxValue = null;
        for (Triangle i : triangles)
            if (i.typeOfTriangle().equals(typeOfTriangle)) {
                if (maxValue == null) {
                    maxValue = i;
                } else if (i.area() > maxValue.area()) {
                    maxValue = i;
                }
            }
        return maxValue;
    }

    private Triangle findMinPerimeter(Triangle[] triangles, String typeOfTriangle) {
        Triangle minValue = null;
        for (Triangle i : triangles)
            if (i.typeOfTriangle().equals(typeOfTriangle)) {
                if (minValue == null) {
                    minValue = i;
                } else if (i.perimeter() < minValue.perimeter()) {
                    minValue = i;
                }
            }
        return minValue;
    }

    private Triangle findMaxPerimeter(Triangle[] triangles, String typeOfTriangle) {
        Triangle maxValue = null;
        for (Triangle i : triangles)
            if (i.typeOfTriangle().equals(typeOfTriangle)) {
                if (maxValue == null) {
                    maxValue = i;
                } else if (i.perimeter() > maxValue.perimeter()) {
                    maxValue = i;
                }
            }
        return maxValue;
    }

    public Triangle minEquilateralArea(Triangle[] triangles) {
        return findMinArea(triangles, "equilateral");
    }

    public Triangle minRectangularArea(Triangle[] triangles) {
        return findMinArea(triangles, "rectangular");
    }

    public Triangle minIsoscelesArea(Triangle[] triangles) {
        return findMinArea(triangles, "isosceles");
    }

    public Triangle minArbitraryArea(Triangle[] triangles) {
        return findMinArea(triangles, "arbitrary");
    }

    public Triangle maxEquilateralArea(Triangle[] triangles) {
        return findMaxArea(triangles, "equilateral");
    }

    public Triangle maxRectangularArea(Triangle[] triangles) {
        return findMaxArea(triangles, "rectangular");
    }

    public Triangle maxIsoscelesArea(Triangle[] triangles) {
        return findMaxArea(triangles, "isosceles");
    }

    public Triangle maxArbitraryArea(Triangle[] triangles) {
        return findMaxArea(triangles, "arbitrary");
    }

    public Triangle minEquilateralPerimeter(Triangle[] triangles) {
        return findMinPerimeter(triangles, "equilateral");
    }

    public Triangle minRectangularPerimeter(Triangle[] triangles) {
        return findMinPerimeter(triangles, "rectangular");
    }

    public Triangle minIsoscelesPerimeter(Triangle[] triangles) {
        return findMinPerimeter(triangles, "isosceles");
    }

    public Triangle minArbitraryPerimeter(Triangle[] triangles) {
        return findMinPerimeter(triangles, "arbitrary");
    }

    public Triangle maxEquilateralPerimeter(Triangle[] triangles) {
        return findMaxPerimeter(triangles, "equilateral");
    }

    public Triangle maxRectangularPerimeter(Triangle[] triangles) {
        return findMaxPerimeter(triangles, "rectangular");
    }

    public Triangle maxIsoscelesPerimeter(Triangle[] triangles) {
        return findMaxPerimeter(triangles, "isosceles");
    }

    public Triangle maxArbitraryPerimeter(Triangle[] triangles) {
        return findMaxPerimeter(triangles, "arbitrary");
    }

    @Override
    public String toString() {
        return "TriangleUtils{" +
                "triangles=" + Arrays.toString(triangles) +
                '}';
    }
}
