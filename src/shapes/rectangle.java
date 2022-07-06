package shapes;

public class rectangle extends Quadrilateral implements Measurable {

    public rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public void setLength() {

    }

    @Override
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public void setLength(double length) {
        super.length = length;
    }

    @Override
    public void setWidth() {

    }
}
