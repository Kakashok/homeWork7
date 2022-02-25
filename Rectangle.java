package lesson7;

public class Rectangle extends Quadrilateral {

    protected String name = "Rectangle";

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        super(a, b, 0, 0, 0, 0);
    }

    @Override
    public double perimeter() {
        perimeter = (a + b) * 2;
        return perimeter;
    }

    @Override
    public double square() {
        square = a * b;
        return square;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                ", a=" + a +
                ", b=" + b +
                '}';
    }
}
