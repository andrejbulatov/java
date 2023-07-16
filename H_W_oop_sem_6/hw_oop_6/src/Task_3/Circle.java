package Task_3;

public class Circle implements Area {

    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * PI * radius;
    }
  
}
