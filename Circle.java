package lesson7;

public class Circle extends Figure {
    protected double r;


    public Circle() {
        name = "Circle";
    }

    public Circle(double r) {
        this.r = r;
        name = "Circle";
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double perimeter() {
        perimeter = Math.PI * 2 * r;
        return perimeter;
    }

    public double square() {
        square = Math.PI * r * r;
        return square;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(r);
        return (int) (temp ^ (temp >>> 32));
    }
}
