package javapractice3;

public abstract class Circle extends Shape {
    protected double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public void Circle(){}

    public void Circle(double radius, String color, boolean filled){}

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    abstract public double getPerimeter();
    abstract public double getArea();

}
