package lesson7;

public class Circle extends Ellipse{


    public Circle() {
        name = "Circle";
    }

    public Circle(double a) {
        super(a, 0);
        name = "Circle";
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
