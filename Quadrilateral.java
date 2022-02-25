package lesson7;

public class Quadrilateral extends Figure {
   protected double a, b, c, d, alpha, beta;

// alpha - угол между a, b. beta - угол между c, d.

    public Quadrilateral() {
        name = "Quadrilateral";
    }


    public Quadrilateral(double a, double b, double c, double d, double alpha, double beta) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.alpha = alpha;
        this.beta = beta;
        name = "Quadrilateral";
    }

    public double getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public double getBeta() {
        return beta;
    }

    public void setBeta(int beta) {
        this.beta = beta;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {this.a = a; }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public double perimeter() {
        perimeter =  a + b + c + d;
        return perimeter;
    }

    public double square() {
        double p = (a + b + c + d) / 2;
        square = Math.sqrt((p - a) * (p - b) * (p - c) * (p - c) - a * b * c * d * Math.pow(Math.cos((alpha + beta) / 2), 2));
        return square;
    }

    @Override
    public String toString() {
        return "Quadrilateral{" +
                "square=" + square +
                ", perimeter=" + perimeter +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                ", alpha=" + alpha +
                ", beta=" + beta +
                                '}';
    }

}
