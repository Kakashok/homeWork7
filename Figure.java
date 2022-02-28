package lesson7;

public class Figure {

    protected double square = 0, perimeter = 0;
    protected String name;

    public Figure() {
        name = "Figure";
    }

    public double getS() {
        return square;
    }

    public double getP() {
        return perimeter;
    }

    void printP(){
        System.out.println(name + " perimeter is: " + perimeter);
    }

    void  printS() {
        System.out.println(name + " square is: " + square);
    }

    @Override
    public String toString() {
        return "Figure{" +
                "s=" + square +
                ", p=" + perimeter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        if (Double.compare(figure.square, square) != 0) return false;
        if (Double.compare(figure.perimeter, perimeter) != 0) return false;
        return name != null ? name.equals(figure.name) : figure.name == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(square);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(perimeter);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
