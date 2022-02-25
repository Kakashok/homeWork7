package lesson7;

public class Ellipse extends Figure{
    protected double a, b;

    public Ellipse() {
        name = "Ellipse";
    }

    public Ellipse(double a, double b) {
        this.a = a;
        this.b = b;
        name = "Ellipse";
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

    public double perimeter(){
        perimeter = 4 * ((Math.PI * a * b + (a - b))/(a + b));
        return perimeter;
    }

    public double square(){
        square = Math.PI * a * b;
        return square;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "a=" + a +
                ", b=" + b +
                ", square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }
}
