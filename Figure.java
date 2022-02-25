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
}
