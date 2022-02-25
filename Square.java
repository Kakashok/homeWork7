package lesson7;

public class Square extends Quadrilateral {


    public Square() {
         name = "Square";
    }

    public Square(double a) {
        super(a, 0, 0, 0, 0, 0);
        name = "Square";
    }


    @Override
    public double perimeter() {
        perimeter = a * 4;
        return perimeter;
    }

    @Override
    public double square() {
        square = a * a;
        return square;
    }

    @Override
    public String toString() {
        return "Square{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                ", a=" + a +
                '}';
    }
}
