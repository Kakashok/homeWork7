package lesson7;

public class Trapezoid extends Quadrilateral {

    protected double h;

    public Trapezoid() {
        name = "Trapezoid";
    }

    public Trapezoid(double a, double b, double c, double d, double h) {
        super(a, b, c, d, 0, 0);
        this.h = h;
        name = "Trapezoid";
    }

    @Override
    public double perimeter() {
        return super.perimeter();
    }

    @Override
    public double square() {
        square = (a + b) / 2 * h;
        return square;
    }

    @Override
    public String toString() {
        return "Trapezoid{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", h=" + h +
                '}';
    }
}
