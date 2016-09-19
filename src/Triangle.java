public class Triangle implements Figure {
    private final double a;
    private final double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public double getArea() {
        return a * h / 2;
    }
}
