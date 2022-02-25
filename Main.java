package lesson7;

public class Main {
    public static void main(String[] args) {
        Otlichnik otlichnik1 = new Otlichnik(23, "Вася");
        Otlichnik otlichnik2 = new Otlichnik(23, "Вася");

        Student student1 = new Student(24, "Кирилл");
        Student student2 = new Student(24, "Кирилл");

        System.out.println(student1.equals(student2));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

        Student[] students = new Student[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = otlichnik1;
        students[3] = otlichnik2;


        System.out.println(student1);


        // for each

        for (Student s : students) {
            System.out.println(s.perimetreTreug(2, 2, 20));  // полиморфизм
            // полиморфизм - свойство жавы работать с разными типами данных как с одним и тем же типом с разной реализацией

        }
        // перегруженные методы - метод с одним названием, но с разными функциям


        Rectangle rectangle = new Rectangle(3, 5);
        rectangle.square();
        rectangle.perimeter();
        rectangle.printP();
        rectangle.printS();


        Trapezoid trapezoid = new Trapezoid(2, 3, 4, 5, 6);

        System.out.println(trapezoid.perimeter());
        trapezoid.printP();
    }

}
