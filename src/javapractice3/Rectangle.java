package javapractice3;

abstract class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    abstract public double getArea();
    abstract public double getPerimeter();

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
