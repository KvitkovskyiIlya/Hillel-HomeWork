package HW4.Triangle;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }


    public double sideAb() {
        return (sqrt(Math.pow((pointB.getX() - pointA.getX()), 2) + Math.pow((pointB.getY() - pointA.getY()), 2)));
    }

    public double sideBc() {
        return ((sqrt(Math.pow((pointC.getX() - pointB.getX()), 2) + Math.pow((pointC.getY() - pointB.getY()), 2))));
    }

    public double sideCa() {
        return (sqrt(Math.pow((pointA.getX() - pointC.getX()), 2) + Math.pow((pointA.getY() - pointC.getY()), 2)));
    }


    public boolean isEquilateral() {
        return (sideAb() == sideBc()) && (sideBc() == sideCa());
    }

    public boolean isIsosceles() {
        return isEquilateral() || ((sideAb() == sideBc()) || (sideBc() == sideCa()) || (sideCa() == sideAb()));
    }

    public boolean isRectangular() {
        if ((Math.pow(sideAb(), 2) == Math.pow(sideBc(), 2) + Math.pow(sideCa(), 2)) ||
                (Math.pow(sideBc(), 2) == Math.pow(sideCa(), 2) + Math.pow(sideAb(), 2)) ||
                (Math.pow(sideCa(), 2) == Math.pow(sideAb(), 2) + Math.pow(sideBc(), 2))) {
            return true;
        }
        return false;
    }

    public boolean isArbitrary() {
        return !isEquilateral() && !isIsosceles() && !isRectangular();
    }

    public double perimeter() {
        return sideAb() + sideBc() + sideCa();
    }

    public double area() {
        double semiPerimeter = 0.5 * perimeter();
        return (Math.sqrt(semiPerimeter * (semiPerimeter - sideAb()) * (semiPerimeter - sideBc()) *
                (semiPerimeter - sideCa())));
    }

    String typeOfTriangle() {
        if (this.isEquilateral()) {
            return "equilateral";
        }
        if (this.isIsosceles()) {
            return "isosceles";
        }
        if (this.isRectangular()) {
            return "rectangular";
        }
        if (this.isArbitrary()) {
            return "arbitrary";
        }
        return "There is no such triangle";
    }

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
}
