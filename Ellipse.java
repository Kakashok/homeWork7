package lesson7;

public class Ellipse extends Circle{
    protected double r2;

    public Ellipse() {
        name = "Ellipse";
    }

    public Ellipse(double r, double r2) {
        super(r);
        this.r2 = r2;
    }

    public double getR2() {
        return r2;
    }

    public void setR2(double r2) {
        this.r2 = r2;
    }

    @Override
    public double perimeter(){
        perimeter = 4 * ((Math.PI * r * r2 + (r - r2))/(r + r2));
        return perimeter;
    }

    @Override
    public double square(){
        square = Math.PI * r * r2;
        return square;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "r=" + r +
                ", r2=" + r2 +
                ", square=" + square +
                ", perimeter=" + perimeter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Ellipse ellipse = (Ellipse) o;

        return Double.compare(ellipse.r2, r2) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(r2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
