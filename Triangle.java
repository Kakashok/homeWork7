package lesson7;

public class Triangle extends Figure {
    protected double a, b, c;
    protected String name = "Triangle";

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double perimeter() {
        perimeter = a + b + c;
        return perimeter;
    }

    public double square() {
        double p = (a + b + c) / 2;
        square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return square;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
