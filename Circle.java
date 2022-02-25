package lesson7;

public class Circle extends Ellipse{

    protected String name = "Circle";


    public Circle() {
    }

    public Circle(double a) {
        super(a, 0);
    }

    @Override
    public double perimeter() {
        perimeter = Math.PI * 2 * a;
        return perimeter;
    }

    @Override
    public double square() {
        square = Math.PI * a * a;
        return square;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                ", square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}